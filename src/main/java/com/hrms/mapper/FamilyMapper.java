package com.hrms.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Family;

public interface FamilyMapper extends BaseMapper<Family> {
	
	public int updateByPrimaryKeySelective(Family family);

	/**
	 * 通过id获取员工信息
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	Family getFamilywithMessagebyid(@Param("id") int id);
	
	/**
	 * 通过搜索工号、员工姓名、员工身份证号获得的搜索结果 分页
	 * 
	 * @param employeeNum
	 * @param name
	 * @param idnumber
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Family> selectFamilyByNNIusePage(@Param("employeeNum") String employeeNum, @Param("name") String m_name,
			@Param("idnumber") String m_idnumber, @Param("page") String page,
			@Param("limit") String limit);

	/**
	 * 获取所有员工家庭信息 分页
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Family> getFamilywithMessage(@Param("page") String page, @Param("limit") String limit);

	/**
	 * 获取员工家庭信息数量
	 * 
	 * @return
	 */
	int getEmployeeFamilyTotal();
	
	/**
	 * 根据搜索条件获取员工总量
	 * @param employeeNum
	 * @param m_name
	 * @param m_idnumber
	 * @return
	 */
	int getEmployeeByNNITotal(@Param("employeeNum") String employeeNum, @Param("name") String m_name,
			@Param("idnumber") String m_idnumber);

	/**
	 * 同时插入多条
	 * @param families
	 * @return
	 */
	int insertMany(List<Family> families);
	/**
	 * 插入一条数据并返回它的id
	 * @param family
	 * @return
	 */
	int insertAndgetPK(Family family);
}