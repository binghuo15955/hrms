package com.hrms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrms.entity.Bank;
import com.hrms.entity.Dictionary;
import com.hrms.entity.Experience;
import com.hrms.entity.Family;
import com.hrms.entity.Message;
import com.hrms.entity.Project;
import com.hrms.entity.School;
import com.hrms.mapper.MessageMapper;
import com.hrms.service.BankServiceI;
import com.hrms.service.DictionaryServiceI;
import com.hrms.service.ExperienceServiceI;
import com.hrms.service.FamilyServiceI;
import com.hrms.service.MessageServiceI;
import com.hrms.service.ProjectServiceI;
import com.hrms.service.SchoolServiceI;
import com.hrms.util.renderData;

@Controller
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageMapper messageMapper;
	
	@Autowired
	private MessageServiceI messageService;
	@Autowired
	private DictionaryServiceI dictionaryService;
	@Autowired
	private FamilyServiceI familyService;
	@Autowired
	private ExperienceServiceI experienceService;
	@Autowired
	private BankServiceI bankService;
	@Autowired
	private SchoolServiceI schoolService;
	@Autowired
	private ProjectServiceI projectService;
	
	
	@RequestMapping("init_editPage")
	@ResponseBody
	public void init_editPage(String employeeNum,ModelMap model,HttpServletResponse response) {
		Message message = new Message();
		message.setEmployeeNum(employeeNum);
		Family family=new Family();
		family.setEmployeeNum(employeeNum);
		Experience experience=new Experience();
		experience.setEmployeeNum(employeeNum);
		Bank bank = new Bank();
		bank.setEmployeeNum(employeeNum);
		School school = new School();
		school.setEmployeeNum(employeeNum);
		Project project=new Project();
		project.setEmployeeNum(employeeNum);
		
		List<Message> messages = messageService.selectByMap(message);
		List<Dictionary> dictionaries = dictionaryService.getDictionary(new Dictionary(),null ,null);
		List<Family> families = familyService.getByMap(family,"","");
		List<Experience> experiences = experienceService.getByMap(experience);
		List<Bank> banks = bankService.getByMap(bank);
		List<School> schools = schoolService.selectByMap(school, "", "");
		List<Project> projects = projectService.selectByMap(project, "", "");
		model.put("message", messages.get(0));
		model.put("dictionaries", dictionaries);
		model.put("families", families);
		model.put("experiences", experiences);
		model.put("banks", banks);
		model.put("schools", schools);
		model.put("projects", projects);
		renderData.render_Data(response, model);
	}
	
	@RequestMapping("getbyname_id")
	@ResponseBody
	public void getEmpMessageByIdorName(ModelMap model,@RequestParam(value="employeeNum") String employeeNum_search,@RequestParam(value="name") String name_search,HttpServletResponse response,String page,String limit){
		List<Message> employee_message = messageService.selectEmployeeByEmpNumorNamebyPage(employeeNum_search, name_search, page, limit);
		model.put("data", employee_message);
		model.put("status", 0);
		model.put("message", "");
		model.put("total", messageService.getEmployeeByEmpNumorNameTotal(employeeNum_search, name_search));
		renderData.render_Data(response, model);
	}
	
	@RequestMapping("getbyid") // 只会是一条数据
	public void getEmpMessageById( String employeeNum, HttpServletRequest request,HttpServletResponse response,ModelMap model) {// 可获取到值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("employeeNum", employeeNum);
		List<Message> employee_message = messageMapper.selectByMap(map);
		Message emp_message=employee_message.get(0);
		model.put("data", emp_message);
		renderData.render_Data(response, model);
	}

	@RequestMapping("edit")
	@ResponseBody
	public String editEmpMessage(Message message) {
		int row = messageService.uptEmpMessage(message);
		System.out.println(row);
		if (row > 0) {
			return "success";
		}
		return "false";
	}

	@RequestMapping("del")
	@ResponseBody
	public String delEmpMessage(String employeeNum) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("employeeNum", employeeNum);
		int row = messageMapper.deleteByMap(map);
		if (row > 0) {
			return "success";
		}
		return "false";
	}

	@RequestMapping("add")
	@ResponseBody
	public String addEmpMessage(Message message) {
		message.setEmployeeNum(UUID.randomUUID().toString().replaceAll("-", ""));
		if("on".equals(message.getHaveChildren())) {
			message.setHaveChildren("是");
		}else {
			message.setHaveChildren("否");
		}
		messageMapper.insert(message);
		return "success";
	}

	@RequestMapping("getEmployeeMessagebyPage")
	public String getAllEmpMessage(ModelMap model,String page,String limit) {
		List<Message> employee_message = messageService.getEmployeeMessagebyPage(page, limit);
		model.put("data", employee_message);
		model.put("status", 0);
		model.put("message", "");
		model.put("total", messageService.getEmployeeMessageTotal());
		System.out.println(messageService.getEmployeeMessageTotal());
		return "emp_message.html";
	}
	

}
