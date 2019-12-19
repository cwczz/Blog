package com.cwc.blogproject.Service.impl;

import com.cwc.blogproject.Entity.User;
import com.cwc.blogproject.Mapper.UserMapper;
import com.cwc.blogproject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired(required = false)
    public UserMapper usermapper;
    @Override
    //登录
    public User getLogin(String username, String password) {
        return usermapper.getUserlogin(username,password);
    }
    //注册
    @Override
    public int addUser(User user) {
    return usermapper.addUser(user);
    }
}
