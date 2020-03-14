package com.hrms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Bank;

public interface BankMapper extends BaseMapper<Bank>{
	/**
	 * 通过搜索工号、员工姓名、身份证号、银行卡账号、开户银行的搜索结果 分页
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
	 * 获取所有员工银行卡信息 分页
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Bank> getEmployeeBankbyPage(@Param("page") String page, @Param("limit") String limit);

	/**
	 * 获取员工银行卡信息数量
	 * 
	 * @return
	 */
	int getEmployeeBankTotal();
	
	/**
	 * 根据搜索条件获取员工银行卡总量
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
	 * 插入一条信息并返回ID
	 * @param bank
	 * @return
	 */
	int insertAndgetPK(Bank bank);
}