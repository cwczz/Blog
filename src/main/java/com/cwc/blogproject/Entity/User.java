package com.cwc.blogproject.Entity;

import lombok.Data;
/*import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;*/
import java.util.Date;
@Data
/*@Table(name = "user")*/
public class User {
   /* @Id
    @KeySql(useGeneratedKeys = true)*/
    private Long id;

    private String nickname;

    private String username;

    private String password;

    private String email;

    private String avatar;

    private Date createtime;
    private Long usertype;
    private  String signature;

}