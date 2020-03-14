package com.hrms.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrms.entity.School;
import com.hrms.service.SchoolServiceI;
import com.hrms.util.renderData;

@Controller
@RequestMapping("school")
public class SchoolController {
	
	@Autowired
	private SchoolServiceI schoolService;
	
	@RequestMapping("get")
	@ResponseBody
	public void get(School school,String page,String limit,ModelMap model,HttpServletResponse response) {
		List<School> schools = schoolService.selectByMap(school, page, limit);
		int total=schoolService.selectByCount(school);
		renderData.render_Data(response, renderData.resp_Layui(schools, total, model));
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String add(School school) {
		int row = schoolService.insert(school);
		if(row>0) {
			return String.valueOf(school.getId());
		}else {
			return "F";
		}
	}
	
	@RequestMapping("del")
	@ResponseBody
	public String del(String id) {
		if(id==null||"".equals(id)) {
			return "F";
		}
		int row = schoolService.del(Integer.parseInt(id));
		if(row>0) {
			return "T";
		}else {
			return "F";
		}
	}
	
	@RequestMapping("upt")
	@ResponseBody
	public String upt(School school) {
		int row = schoolService.upt(school);
		if(row>0) {
			return "T";
		}else {
			return "F";
		}
	}

}
