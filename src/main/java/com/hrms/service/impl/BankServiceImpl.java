package com.hrms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.entity.Bank;
import com.hrms.mapper.BankMapper;
import com.hrms.service.BankServiceI;

@Service("bankService")
public class BankServiceImpl implements BankServiceI {

	@Autowired
	private BankMapper BankMapper;

	@Override
	public List<Bank> selectBankByNNIAOusePage(String employeeNum, String name, String idnumber, String account,
			String openbank, String page, String limit) {
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p = (p - 1) * l;
		page = String.valueOf(p);
		return BankMapper.selectBankByNNIAOusePage(employeeNum, name, idnumber, account, openbank, page, limit);
	}

	@Override
	public List<Bank> getEmployeeBankbyPage(String page, String limit) {
		if (page == null && limit == null) {
			return null;
		}
		// 计算开始的item编号
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p = (p - 1) * l;
		page = String.valueOf(p);
		return BankMapper.getEmployeeBankbyPage(page, limit);
	}

	@Override
	public int getEmployeeBankTotal() {
		return BankMapper.getEmployeeBankTotal();
	}

	@Override
	public int getEmployeeBankByNNIAOTotal(String employeeNum, String name, String idnumber, String account,
			String openbank) {
		return BankMapper.getEmployeeBankByNNIAOTotal(employeeNum, name, idnumber, account, openbank);
	}

	@Override
	public int add(Bank bank) {
		return BankMapper.insertAndgetPK(bank);
	}

	@Override
	public List<Bank> getByMap(Bank bank) {
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("employeeNum", bank.getEmployeeNum());
		return BankMapper.selectByMap(map);
	}

}
