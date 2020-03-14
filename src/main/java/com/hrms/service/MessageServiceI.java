package com.hrms.service;

import java.util.List;

import com.hrms.entity.Message;

public interface MessageServiceI{
	
	public int uptEmpMessage(Message message);
	
	public List<Message> selectEmployeeByEmpNumorNamebyPage(String employeeNum,String name,String page,String limit);
	
	public List<Message> getEmployeeMessagebyPage(String page,String limit);
	
	public int getEmployeeMessageTotal();
	
	public int getEmployeeByEmpNumorNameTotal(String employeeNums,String name);

	public List<Message> selectByMap(Message message);
}
