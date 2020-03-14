package com.hrms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hrms.service.MessageDetailServiceI;

@Controller
@RequestMapping("/messagedetail")
public class MessageDetailController {
	
	@Autowired
	private MessageDetailServiceI messageDetailService;
	
	@RequestMapping("add")
	public void add(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//¥¶¿Ìjson
		Object[] objects =request.getParameterMap().keySet().toArray();		
		String requestText=objects[0].toString();
		JSONArray jsonArray= JSON.parseArray(requestText);
		messageDetailService.addEmp_family_experience_bank(jsonArray);
		response.getWriter().write("success");
	}

}
