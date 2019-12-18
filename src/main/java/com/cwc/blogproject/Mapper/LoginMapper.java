package com.cwc.blogproject.Mapper;

import com.cwc.blogproject.Entity.User;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper{
  User getUserlogin(@Param("username") String username,@Param("password") String password);
}
