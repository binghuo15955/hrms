package com.hrms.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hrms.entity.Bank;

public interface BankServiceI {
	/**
	 * 通过搜索工号、员工姓名、身份证号、银行卡账号、开户银行的搜索结果 分页
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
	 * 获取所有员工银行卡信息 分页
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Bank> getEmployeeBankbyPage(String page, String limit);

	/**
	 * 获取员工银行卡信息数量
	 * 
	 * @return
	 */
	int getEmployeeBankTotal();

	/**
	 * 根据搜索条件获取员工银行卡总量
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
	 * 添加银行账户信息
	 * @param bank
	 * @return
	 */
	public int add(Bank bank);
	/**
	 * 根据实体中的条件查询
	 * @param bank
	 * @return
	 */
	List<Bank> getByMap(Bank bank);

}
