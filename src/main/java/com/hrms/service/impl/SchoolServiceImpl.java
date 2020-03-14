package com.hrms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.hrms.entity.School;
import com.hrms.mapper.SchoolMapper;
import com.hrms.service.SchoolServiceI;

@Service("schoolService")
public class SchoolServiceImpl implements SchoolServiceI {
	
	@Autowired
	private SchoolMapper schoolMapper;

	@Override
	public int insert(School school) {
		return schoolMapper.insert(school);
	}

	@Override
	public int del(int id) {
		return schoolMapper.deleteById(id);
	}

	@Override
	public int upt(School school) {
		return schoolMapper.updateById(school);
	}

	@Override
	public List<School> selectByMap(School school, String page, String limit) {
		QueryWrapper<School> queryWrapper = new QueryWrapper<School>();
		//判断是否需要分页
		if(page!=null&&!"".equals(page)&&limit!=null&&!"".equals(limit)) {
			PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
		}
		//判断是否有条件
		if(school.getEmployeeNum()!=null&&!"".equals(school.getEmployeeNum())) {
			queryWrapper.like("employeeNum", school.getEmployeeNum());
		}
		if(school.getStart_time()!=null) {
			queryWrapper.ge("start_time", school.getStart_time());
		}
		if(school.getEnd_time()!=null) {
			queryWrapper.le("end_time", school.getEnd_time());
		}
		if(school.getSchool()!=null&&!"".equals(school.getSchool())) {
			queryWrapper.like("school", school.getSchool());
		}
		if(school.getMajor()!=null&&!"".equals(school.getMajor())) {
			queryWrapper.like("major", school.getMajor());
		}
		if(school.getType()!=null&&!"".equals(school.getType())) {
			queryWrapper.like("type", school.getType());
		}
		if(school.getGraduation()!=null&&!"".equals(school.getGraduation())) {
			queryWrapper.like("graduation", school.getGraduation());
		}
		return schoolMapper.selectList(queryWrapper);
	}

	@Override
	public int selectByCount(School school) {
		QueryWrapper<School> queryWrapper = new QueryWrapper<School>();
		//判断是否有条件
		if(school.getEmployeeNum()!=null&&!"".equals(school.getEmployeeNum())) {
			queryWrapper.like("employeeNum", school.getEmployeeNum());
		}
		if(school.getStart_time()!=null) {
			queryWrapper.ge("start_time", school.getStart_time());
		}
		if(school.getEnd_time()!=null) {
			queryWrapper.le("end_time", school.getEnd_time());
		}
		if(school.getSchool()!=null&&!"".equals(school.getSchool())) {
			queryWrapper.like("school", school.getSchool());
		}
		if(school.getMajor()!=null&&!"".equals(school.getMajor())) {
			queryWrapper.like("major", school.getMajor());
		}
		if(school.getType()!=null&&!"".equals(school.getType())) {
			queryWrapper.like("type", school.getType());
		}
		if(school.getGraduation()!=null&&!"".equals(school.getGraduation())) {
			queryWrapper.like("graduation", school.getGraduation());
		}
		return schoolMapper.selectCount(queryWrapper);
	}

}
