package com.hrms.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrms.entity.Project;
import com.hrms.service.ProjectServiceI;
import com.hrms.util.renderData;

@Controller
@RequestMapping("project")
public class ProjectController {
	
	@Autowired
	private ProjectServiceI projectService;
	
	@RequestMapping("get")
	@ResponseBody
	public void get(Project project,String page,String limit,ModelMap model,HttpServletResponse response) {
		List<Project> projects = projectService.selectByMap(project, page, limit);
		int total=projectService.selectByCount(project);
		renderData.render_Data(response, renderData.resp_Layui(projects, total, model));
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String add(Project project) {
		int row = projectService.insert(project);
		if(row>0) {
			return String.valueOf(project.getId());
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
		int row = projectService.del(Integer.parseInt(id));
		if(row>0) {
			return "T";
		}else {
			return "F";
		}
	}
	
	@RequestMapping("upt")
	@ResponseBody
	public String upt(Project project) {
		int row = projectService.upt(project);
		if(row>0) {
			return "T";
		}else {
			return "F";
		}
	}

}
