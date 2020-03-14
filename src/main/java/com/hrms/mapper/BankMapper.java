package com.hrms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Bank;

public interface BankMapper extends BaseMapper<Bank>{
	/**
	 * ͨ���������š�Ա�����������֤�š����п��˺š��������е�������� ��ҳ
	 * @param employeeNum
	 * @param name
	 * @param idnumber
	 * @param account
	 * @param openbank
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Bank> selectBankByNNIAOusePage(@Param("employeeNum") String employeeNum, @Param("name") String name,
			@Param("idnumber") String idnumber, @Param("account") String account, @Param("openbank") String openbank,@Param("page") String page,
			@Param("limit") String limit);

	/**
	 * ��ȡ����Ա�����п���Ϣ ��ҳ
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Bank> getEmployeeBankbyPage(@Param("page") String page, @Param("limit") String limit);

	/**
	 * ��ȡԱ�����п���Ϣ����
	 * 
	 * @return
	 */
	int getEmployeeBankTotal();
	
	/**
	 * ��������������ȡԱ�����п�����
	 * @param employeeNum
	 * @param name
	 * @param idnumber
	 * @param account
	 * @param openbank
	 * @return
	 */
	int getEmployeeBankByNNIAOTotal(@Param("employeeNum") String employeeNum, @Param("name") String name,
			@Param("idnumber") String idnumber, @Param("account") String account, @Param("openbank") String openbank);

	/**
	 * ����һ����Ϣ������ID
	 * @param bank
	 * @return
	 */
	int insertAndgetPK(Bank bank);
}