package com.hrms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.School;

public interface SchoolMapper extends BaseMapper<School>{
	/**
	 * ���벢����ID
	 */
	int insertRetId(School school);
}