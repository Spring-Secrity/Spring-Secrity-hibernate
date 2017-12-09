package com.anlu.secrity.service.impl;

import com.anlu.secrity.dao.UserDao;
import com.anlu.secrity.model.User;
import com.anlu.secrity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    public User findById(int id) {
        return dao.findById(id);
    }


    public User findBySso(String sso) {
        return dao.findBySSO(sso);
    }
}
