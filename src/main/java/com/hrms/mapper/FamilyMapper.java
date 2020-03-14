package com.hrms.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Family;

public interface FamilyMapper extends BaseMapper<Family> {
	
	public int updateByPrimaryKeySelective(Family family);

	/**
	 * ͨ��id��ȡԱ����Ϣ
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	Family getFamilywithMessagebyid(@Param("id") int id);
	
	/**
	 * ͨ���������š�Ա��������Ա�����֤�Ż�õ�������� ��ҳ
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
	 * ��ȡ����Ա����ͥ��Ϣ ��ҳ
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Family> getFamilywithMessage(@Param("page") String page, @Param("limit") String limit);

	/**
	 * ��ȡԱ����ͥ��Ϣ����
	 * 
	 * @return
	 */
	int getEmployeeFamilyTotal();
	
	/**
	 * ��������������ȡԱ������
	 * @param employeeNum
	 * @param m_name
	 * @param m_idnumber
	 * @return
	 */
	int getEmployeeByNNITotal(@Param("employeeNum") String employeeNum, @Param("name") String m_name,
			@Param("idnumber") String m_idnumber);

	/**
	 * ͬʱ�������
	 * @param families
	 * @return
	 */
	int insertMany(List<Family> families);
	/**
	 * ����һ�����ݲ���������id
	 * @param family
	 * @return
	 */
	int insertAndgetPK(Family family);
}