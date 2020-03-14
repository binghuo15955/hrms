package com.hrms.service;

import java.util.List;

import com.hrms.entity.School;

public interface SchoolServiceI {
	/**
	 * 添加一个school并返回ID
	 * @param school
	 * @return
	 */
	public int insert(School school);
	/**
	 * 根据ID删除
	 * @param id
	 * @return
	 */
	public int del(int id);
	/**
	 * 根据id修改
	 * @param school
	 * @return
	 */
	public int upt(School school);
	/**
	 * 根据条件搜索 （分页）
	 * @param school
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<School> selectByMap(School school,String page,String limit);
	/**
	 * 根据条件搜索 统计总数
	 * @param school
	 * @return
	 */
	public int selectByCount(School school);

}
