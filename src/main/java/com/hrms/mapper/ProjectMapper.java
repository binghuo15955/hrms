package com.hrms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Project;

public interface ProjectMapper extends BaseMapper<Project>{
	/**
	 * ���벢����ID
	 */
	int insertRetId(Project project);
}