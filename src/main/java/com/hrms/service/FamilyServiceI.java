package com.hrms.service;

import java.util.List;
import java.util.Map;

import com.hrms.entity.Bank;
import com.hrms.entity.Family;

public interface FamilyServiceI {
	
	/**
	 * 获取家庭信息通过PK-id
	 * @param id
	 * @return
	 */
	public Family getFamilywithMessagebyid(int id) ;
	
	public int uptEmpFamily(Family family);
	/**
	 * 通过搜索工号、家庭成员姓名、身份证号、电话号码的搜索结果
	 * 分页
	 * @param employeeNum
	 * @param name
	 * @param idnumber
	 * @param telephone
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<Family> selectFamilyByNNIusePage(String employeeNum,String m_name,String m_idnumber,String page,String limit);
	
	/**
	 * 获取所有员工家庭信息
	 * 分页
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<Family> getEmployeeFamilybyPage(String page,String limit);
	
	/**
	 * 获取员工家庭信息数量
	 * @return
	 */
	public int getEmployeeFamilyTotal();
	
	/**
	 * 根据搜索条件获取员工总量
	 * @param employeeNums
	 * @param name
	 * @param idnumber
	 * @param telephone
	 * @return
	 */
	public int getEmployeeByNNITotal(String employeeNum,String m_name,String m_idnumber);
	/**
	 * 添加一条信息
	 * @param family
	 * @return
	 */
	public int add(Family family);
	/**
	 * 根据实体中的条件查询
	 * @param family
	 * @return
	 */
	public List<Family> getByMap(Family family,String limit,String page);
	/**
	 * 根据实体中的条件查询总数
	 * @param family
	 * @return
	 */
	public int countByMap(Family family);
}
