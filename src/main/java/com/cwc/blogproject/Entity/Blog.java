package com.cwc.blogproject.Entity;

import lombok.Data;

import java.util.Date;
@Data
public class Blog {
    private Long id;

    private String title;

    private String content;

    private String firstpicture;

    private String flag;

    private Integer views;

    private Boolean appreciation;

    private Boolean sharestatement;

    private Boolean commenttabled;

    private Boolean published;

    private Boolean recommend;

    private Date createtime;

    private Date updatetime;

    private Type type;

    private User user;


}