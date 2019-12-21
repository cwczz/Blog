package com.cwc.blogproject.Mapper;

import com.cwc.blogproject.Entity.BlogTag;
import java.util.List;

public interface BlogTagMapper {
    int insert(BlogTag record);

    List<BlogTag> selectAll();
}