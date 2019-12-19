package com.cwc.blogproject.Mapper;

import com.cwc.blogproject.Entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
  //登录
  User getUserlogin(@Param("username") String username, @Param("password") String password);
  //注册
  int addUser(User user);
}
