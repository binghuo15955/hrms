package com.hrms.service;

import java.util.List;

import com.hrms.entity.School;

public interface SchoolServiceI {
	/**
	 * ���һ��school������ID
	 * @param school
	 * @return
	 */
	public int insert(School school);
	/**
	 * ����IDɾ��
	 * @param id
	 * @return
	 */
	public int del(int id);
	/**
	 * ����id�޸�
	 * @param school
	 * @return
	 */
	public int upt(School school);
	/**
	 * ������������ ����ҳ��
	 * @param school
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<School> selectByMap(School school,String page,String limit);
	/**
	 * ������������ ͳ������
	 * @param school
	 * @return
	 */
	public int selectByCount(School school);

}
