package com.anlu.secrity.configuration;

import com.anlu.secrity.model.User;
import com.anlu.secrity.service.UserDetailsService;
import com.anlu.secrity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;

import javax.annotation.Resource;


public class SecurityProvider implements AuthenticationProvider{

    @Autowired
    private UserDetailsService userDetailsService;


    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
        UserDetails userDetails = userDetailsService.loadUserByUsername("ww");

//        User testUser = userService.findBySso("ddd");

        if (userDetails == null) {
            throw new UsernameNotFoundException("账号不存在");
        }
        return new UsernamePasswordAuthenticationToken(userDetails,"s",userDetails.getAuthorities());
    }

    public boolean supports(Class<?> aClass) {
        return  UsernamePasswordAuthenticationToken.class.equals(aClass);
    }
}
