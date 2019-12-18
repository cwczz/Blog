package com.cwc.blogproject.Service.impl;

import com.cwc.blogproject.Entity.User;
import com.cwc.blogproject.Mapper.LoginMapper;
import com.cwc.blogproject.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class LoginServiceimpl implements LoginService {
    @Autowired(required = false)
    public LoginMapper loginmapper;
    @Override
    //登录
    public User getLogin( String username, String password) {
        return loginmapper.getUserlogin(username,password);
    }
}
