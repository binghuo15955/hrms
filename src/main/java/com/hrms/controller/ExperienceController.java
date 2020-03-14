package com.hrms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrms.entity.Experience;
import com.hrms.mapper.ExperienceMapper;
import com.hrms.service.ExperienceServiceI;
import com.hrms.util.renderData;

@Controller
@RequestMapping("/experience")
public class ExperienceController {

	@Autowired
	private ExperienceMapper ExperienceMapper;

	@Autowired
	private ExperienceServiceI experienceService;

	@RequestMapping("getbymany")
	@ResponseBody
	public void getEmpExperienceByENISECPusePage(ModelMap model,
			@RequestParam(value = "employeeNum") String employeeNum_search,
			@RequestParam(value = "name") String name_search, @RequestParam(value = "idnumber") String idnumber_search,
			@RequestParam(value = "start_time") String start_time_search,
			@RequestParam(value = "end_time") String end_time_search,
			@RequestParam(value = "company") String company_search,
			@RequestParam(value = "position") String position_search, String page, String limit,
			HttpServletResponse response) throws Exception {
		List<Experience> employee_Experience = experienceService.selectExperienceByENISECPusePage(employeeNum_search,
				name_search, idnumber_search, start_time_search, end_time_search, company_search, position_search, page,
				limit);
		model.put("data", employee_Experience);
		model.put("status", 0);
		model.put("Experience", "");
		model.put("total", experienceService.getEmployeeByENISECPTotal(employeeNum_search, name_search, idnumber_search,
				start_time_search, end_time_search, company_search, position_search));
		renderData.render_Data(response, model);
	}

	@RequestMapping("getbyid") // 只会是一条数据,查看详细资料或修改回填时
	public void getEmpExperienceById(HttpServletRequest request, String id, HttpServletResponse response,ModelMap model) {// 可获取到值
		Experience employee_Experience = experienceService.getExperiencewithMessagebyid(Integer.parseInt(id));
		model.put("experience", employee_Experience);
		renderData.render_Data(response, model);
	}

	@RequestMapping("edit")
	@ResponseBody
	public String editEmpExperience(Experience Experience) {
		int row = experienceService.uptEmpExperience(Experience);
		if (row > 0) {
			return "success";
		}
		return "false";
	}

	@RequestMapping("del")
	@ResponseBody
	public String delEmpExperience(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		int row = ExperienceMapper.deleteByMap(map);
		if (row > 0) {
			return "success";
		}
		return "false";
	}

	
	@RequestMapping("add")
	@ResponseBody
	public String add(Experience experience) {
		int row = experienceService.add(experience);
		System.err.println(experience.getId());
		if(row>0) {
			return String.valueOf(experience.getId());
		}else {
			return "F";
		}
	}
	
	
	@RequestMapping("getEmployeeExperiencebyPage")
	public String getAllEmpExperience(ModelMap model, String page, String limit) {
		List<Experience> employee_Experience = experienceService.getEmployeeExperiencebyPage(page, limit);
		model.put("data", employee_Experience);
		model.put("status", 0);
		model.put("Experience", "");
		model.put("total", experienceService.getEmployeeExperienceTotal());
		System.out.println(experienceService.getEmployeeExperienceTotal());
		return "emp_Experience.html";
	}

}
