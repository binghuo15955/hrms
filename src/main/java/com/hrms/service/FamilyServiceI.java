package com.hrms.service;

import java.util.List;
import java.util.Map;

import com.hrms.entity.Bank;
import com.hrms.entity.Family;

public interface FamilyServiceI {
	
	/**
	 * ��ȡ��ͥ��Ϣͨ��PK-id
	 * @param id
	 * @return
	 */
	public Family getFamilywithMessagebyid(int id) ;
	
	public int uptEmpFamily(Family family);
	/**
	 * ͨ���������š���ͥ��Ա���������֤�š��绰������������
	 * ��ҳ
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
	 * ��ȡ����Ա����ͥ��Ϣ
	 * ��ҳ
	 * @param page
	 * @param limit
	 * @return
	 */
	public List<Family> getEmployeeFamilybyPage(String page,String limit);
	
	/**
	 * ��ȡԱ����ͥ��Ϣ����
	 * @return
	 */
	public int getEmployeeFamilyTotal();
	
	/**
	 * ��������������ȡԱ������
	 * @param employeeNums
	 * @param name
	 * @param idnumber
	 * @param telephone
	 * @return
	 */
	public int getEmployeeByNNITotal(String employeeNum,String m_name,String m_idnumber);
	/**
	 * ���һ����Ϣ
	 * @param family
	 * @return
	 */
	public int add(Family family);
	/**
	 * ����ʵ���е�������ѯ
	 * @param family
	 * @return
	 */
	public List<Family> getByMap(Family family,String limit,String page);
	/**
	 * ����ʵ���е�������ѯ����
	 * @param family
	 * @return
	 */
	public int countByMap(Family family);
}
