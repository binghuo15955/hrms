package com.hrms.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hrms.entity.Bank;

public interface BankServiceI {
	/**
	 * ͨ���������š�Ա�����������֤�š����п��˺š��������е�������� ��ҳ
	 * 
	 * @param employeeNum
	 * @param name
	 * @param idnumber
	 * @param account
	 * @param openbank
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Bank> selectBankByNNIAOusePage(String employeeNum, String name, String idnumber, String account,
			String openbank, String page, String limit);

	/**
	 * ��ȡ����Ա�����п���Ϣ ��ҳ
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Bank> getEmployeeBankbyPage(String page, String limit);

	/**
	 * ��ȡԱ�����п���Ϣ����
	 * 
	 * @return
	 */
	int getEmployeeBankTotal();

	/**
	 * ��������������ȡԱ�����п�����
	 * 
	 * @param employeeNum
	 * @param name
	 * @param idnumber
	 * @param account
	 * @param openbank
	 * @return
	 */
	int getEmployeeBankByNNIAOTotal(String employeeNum, String name, String idnumber, String account, String openbank);

	/**
	 * ��������˻���Ϣ
	 * @param bank
	 * @return
	 */
	public int add(Bank bank);
	/**
	 * ����ʵ���е�������ѯ
	 * @param bank
	 * @return
	 */
	List<Bank> getByMap(Bank bank);

}
