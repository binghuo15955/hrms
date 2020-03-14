package com.hrms.service;

import java.util.List;

import com.hrms.entity.Project;

public interface ProjectServiceI {
	/**
	 * ���һ��project������ID
	 * @param project
	 * @return
	 */
	public int insert(Project project);
	/**
	 * ����IDɾ��
	 * @param id
	 * @return
	 */
	public int del(int id);
	/**
	 * ����id�޸�
	 * @param project
	 * @return
	 */
	public int upt(Project project);
	/**
	 * ������������ ����ҳ��
	 * @param project
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<Project> selectByMap(Project project,String page,String limit);
	/**
	 * ������������ ͳ������
	 * @param project
	 * @return
	 */
	public int selectByCount(Project project);

}
