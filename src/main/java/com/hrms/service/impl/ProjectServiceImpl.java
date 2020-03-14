package com.hrms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.hrms.entity.Project;
import com.hrms.mapper.ProjectMapper;
import com.hrms.service.ProjectServiceI;

@Service("projectService")
public class ProjectServiceImpl implements ProjectServiceI {

	@Autowired
	private ProjectMapper projectMapper;

	@Override
	public int insert(Project project) {
		return projectMapper.insert(project);
	}

	@Override
	public int del(int id) {
		return projectMapper.deleteById(id);
	}

	@Override
	public int upt(Project project) {
		return projectMapper.updateById(project);
	}

	@Override
	public List<Project> selectByMap(Project project, String page, String limit) {
		QueryWrapper<Project> queryWrapper = new QueryWrapper<Project>();
		// 判断是否需要分页
		if (page != null && !"".equals(page) && limit != null && !"".equals(limit)) {
			PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
		}
		// 判断是否有条件
		if (project.getEmployeeNum() != null && !"".equals(project.getEmployeeNum())) {
			queryWrapper.like("employeeNum", project.getEmployeeNum());
		}
		if (project.getStart_time() != null) {
			queryWrapper.ge("start_time", project.getStart_time());
		}
		if (project.getEnd_time() != null) {
			queryWrapper.le("end_time", project.getEnd_time());
		}
		if (project.getCompany() != null && !"".equals(project.getCompany())) {
			queryWrapper.like("company", project.getCompany());
		}
		return projectMapper.selectList(queryWrapper);
	}

	@Override
	public int selectByCount(Project project) {
		QueryWrapper<Project> queryWrapper = new QueryWrapper<Project>();
		// 判断是否有条件
		if (project.getEmployeeNum() != null && !"".equals(project.getEmployeeNum())) {
			queryWrapper.like("employeeNum", project.getEmployeeNum());
		}
		if (project.getStart_time() != null) {
			queryWrapper.ge("start_time", project.getStart_time());
		}
		if (project.getEnd_time() != null) {
			queryWrapper.le("end_time", project.getEnd_time());
		}
		if (project.getCompany() != null && !"".equals(project.getCompany())) {
			queryWrapper.like("company", project.getCompany());
		}
		return projectMapper.selectCount(queryWrapper);
	}

}
