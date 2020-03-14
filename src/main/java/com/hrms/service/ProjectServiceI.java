package com.hrms.service;

import java.util.List;

import com.hrms.entity.Project;

public interface ProjectServiceI {
	/**
	 * 添加一个project并返回ID
	 * @param project
	 * @return
	 */
	public int insert(Project project);
	/**
	 * 根据ID删除
	 * @param id
	 * @return
	 */
	public int del(int id);
	/**
	 * 根据id修改
	 * @param project
	 * @return
	 */
	public int upt(Project project);
	/**
	 * 根据条件搜索 （分页）
	 * @param project
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<Project> selectByMap(Project project,String page,String limit);
	/**
	 * 根据条件搜索 统计总数
	 * @param project
	 * @return
	 */
	public int selectByCount(Project project);

}
