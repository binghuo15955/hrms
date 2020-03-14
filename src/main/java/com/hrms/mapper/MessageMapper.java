package com.hrms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Message;

public interface MessageMapper extends BaseMapper<Message>{
	
	 int updateByPrimaryKeySelective(Message record);
	 
	 List<Message> selectEmployeeByEmpNumorNamebyPage(@Param("employeeNum") String employeeNum,@Param("name") String name,@Param("page") String page,@Param("limit") String limit);
	 
	 List<Message> getEmployeeMessagebyPage(@Param("page") String page,@Param("limit") String limit);
	 
	 int getEmployeeMessageTotal();
	 
	 int getEmployeeByEmpNumorNameTotal(@Param("employeeNum") String employeeNum,@Param("name") String name);
	 
}