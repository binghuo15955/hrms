package com.hrms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hrms.entity.Message;
import com.hrms.mapper.MessageMapper;
import com.hrms.service.MessageServiceI;

@Service("messageService")
public class MessageServiceImpl implements MessageServiceI {

	@Autowired
	private MessageMapper MessageMapper;
	
	@Override
	public int uptEmpMessage(Message message) {
		UpdateWrapper<Message> updateWrapper = new UpdateWrapper<>();
		if("on".equals(message.getHaveChildren())) {
			message.setHaveChildren("是");
		}else {
			message.setHaveChildren("否");
		}
		if(message.getEmployeeNum()!=null&&!"".equals(message.getEmployeeNum())) {
			updateWrapper.eq("employeeNum", message.getEmployeeNum());
		}
		return MessageMapper.update(message, updateWrapper);
	}

	@Override
	public List<Message> selectEmployeeByEmpNumorNamebyPage(String employeeNum, String name,String page,String limit) {
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p=(p-1)*l;
		page=String.valueOf(p);
		return MessageMapper.selectEmployeeByEmpNumorNamebyPage(employeeNum, name, page, limit);
	}

	@Override
	public List<Message> getEmployeeMessagebyPage(String page, String limit) {
		if (page==null && limit==null) {
			return null;
		}
		//计算开始的item编号
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p=(p-1)*l;
		page=String.valueOf(p);
		return MessageMapper.getEmployeeMessagebyPage(page, limit);
	}

	@Override
	public int getEmployeeMessageTotal() {
		return MessageMapper.getEmployeeMessageTotal();
	}

	public int getEmployeeByEmpNumorNameTotal(String employeeNum,String name) {
		return MessageMapper.getEmployeeByEmpNumorNameTotal(employeeNum,name);
	}

	@Override
	public List<Message> selectByMap(Message message) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(message.getEmployeeNum()!=null&&!"".equals(message.getEmployeeNum())) {
			map.put("employeeNum", message.getEmployeeNum());
		}
		return MessageMapper.selectByMap(map);
	}
}
