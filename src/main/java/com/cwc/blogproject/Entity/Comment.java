package com.cwc.blogproject.Entity;

import lombok.Data;

import java.util.Date;
@Data
public class Comment {
    private Long id;

    private String commentName;

    private String emali;

    private String avatar;

    private String content;

    private Date createtime;

    private Blog blog;

    private Long parentcommentId;


}