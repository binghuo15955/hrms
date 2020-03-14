package com.hrms.service;

import java.util.List;

import com.hrms.entity.Experience;

public interface ExperienceServiceI {

	Experience getExperiencewithMessagebyid(int id);

	int uptEmpExperience(Experience experience);

	List<Experience> selectExperienceByENISECPusePage(String employeeNum, String m_name, String m_idnumber,
			String start_time, String end_time, String company, String position, String page, String limit) throws Exception;

	List<Experience> getEmployeeExperiencebyPage(String page, String limit);

	int getEmployeeExperienceTotal();

	int getEmployeeByENISECPTotal(String employeeNum, String m_name, String m_idnumber, String start_time,
			String end_time, String company, String position) throws Exception;
	/**
	 * 添加一条并返回id
	 * @param experience
	 * @return
	 */
	int add(Experience experience);
	/**
	 * 根据实体中的条件查询
	 * @param experience
	 * @return
	 */
	List<Experience> getByMap(Experience experience);

}