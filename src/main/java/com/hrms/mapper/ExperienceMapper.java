package com.hrms.mapper;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Experience;

public interface ExperienceMapper extends BaseMapper<Experience> {
	public int updateByPrimaryKeySelective(Experience experience);
	/**
	 * 通过id获取员工信息
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	Experience getExperiencewithMessagebyid(@Param("id") int id);

	/**
	 * 通过搜索工号、员工姓名、身份证号、开始时间、结束时间、单位名称、岗位的搜索结果&分页
	 * @param employeeNum
	 * @param m_name
	 * @param m_idnumber
	 * @param start_time
	 * @param end_time
	 * @param company
	 * @param position
	 * @param page
	 * @param limit
	 * @return
	 */
	 
	List<Experience> selectExperienceByENISECPusePage(@Param("employeeNum") String employeeNum,
			@Param("name") String m_name, @Param("idnumber") String m_idnumber, @Param("start_time") LocalDate start_time,
			@Param("end_time") LocalDate end_time, @Param("company") String company, @Param("position") String position,
			@Param("page") String page, @Param("limit") String limit);

	/**
	 * 获取所有员工工作简历&分页
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Experience> getEmployeeExperiencebyPage(@Param("page") String page, @Param("limit") String limit);

	/**
	 * 获取员工家庭信息数量
	 * 
	 * @return
	 */
	int getEmployeeExperienceTotal();

	/**
	 * 根据搜索条件获取员工总量
	 * @param employeeNum
	 * @param m_name
	 * @param m_idnumber
	 * @param start_time
	 * @param end_time
	 * @param company
	 * @param position
	 * @return
	 */
	int getEmployeeByENISECPTotal(@Param("employeeNum") String employeeNum,
			@Param("name") String m_name, @Param("idnumber") String m_idnumber, @Param("start_time") LocalDate start_time,
			@Param("end_time") LocalDate end_time, @Param("company") String company, @Param("position") String position);
	/**
	 * 添加并返回ID
	 * @param experience
	 * @return
	 */
	public int insertAndgetPK(Experience experience);
}