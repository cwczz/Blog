package com.cwc.blogproject.Service;

import com.cwc.blogproject.Entity.User;


public interface LoginService{
    //用户登录
    public User getLogin(String username,String password);
}
