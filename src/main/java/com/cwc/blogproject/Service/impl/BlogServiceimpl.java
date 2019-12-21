package com.cwc.blogproject.Service.impl;

import com.cwc.blogproject.Entity.Blog;
import com.cwc.blogproject.Mapper.BlogMapper;
import com.cwc.blogproject.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceimpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    /*初始化页面数据*/
    @Override
    public List<Blog> selectAll() {
        return  blogMapper.selectAll();
    }
}
