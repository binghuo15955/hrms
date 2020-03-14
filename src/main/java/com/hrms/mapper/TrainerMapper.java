package com.hrms.mapper;

import com.hrms.entity.Trainer;

public interface TrainerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Trainer record);

    int insertSelective(Trainer record);

    Trainer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Trainer record);

    int updateByPrimaryKey(Trainer record);
}