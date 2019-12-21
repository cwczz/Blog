package com.cwc.blogproject.Service;

import com.cwc.blogproject.Entity.Blog;

import java.util.List;

public interface BlogService{
    /*初始化页面数据*/
    List<Blog> selectAll();
}
