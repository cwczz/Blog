package com.cwc.blogproject.Mapper;

import com.cwc.blogproject.Entity.Blog;
import java.util.List;

public interface BlogMapper {
    /*初始化页面数据*/
    List<Blog> selectAll();
}