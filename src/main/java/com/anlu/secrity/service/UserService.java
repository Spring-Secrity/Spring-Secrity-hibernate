package com.anlu.secrity.service;


import com.anlu.secrity.model.User;

public interface UserService {
    User findById(int id);

    User findBySso(String sso);
}
