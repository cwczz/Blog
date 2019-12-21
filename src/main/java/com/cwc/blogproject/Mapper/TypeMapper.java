package com.cwc.blogproject.Mapper;

import com.cwc.blogproject.Entity.Type;
import java.util.List;

public interface TypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Type record);

    Type selectByPrimaryKey(Long id);

    List<Type> selectAll();

    int updateByPrimaryKey(Type record);
}