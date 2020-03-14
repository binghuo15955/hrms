package com.hrms.mapper;

import com.hrms.entity.Resign;

public interface ResignMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Resign record);

    int insertSelective(Resign record);

    Resign selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Resign record);

    int updateByPrimaryKey(Resign record);
}