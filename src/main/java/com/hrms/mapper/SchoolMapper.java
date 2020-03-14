package com.hrms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.School;

public interface SchoolMapper extends BaseMapper<School>{
	/**
	 * ≤Â»Î≤¢∑µªÿID
	 */
	int insertRetId(School school);
}