package com.cwc.blogproject.Service;

import com.cwc.blogproject.Entity.User;


public interface UserService {
    //用户登录
    public User getLogin(String username, String password);
    //用户注册
    int addUser(User user);
}
