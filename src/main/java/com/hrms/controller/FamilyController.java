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

import com.hrms.entity.Family;
import com.hrms.mapper.FamilyMapper;
import com.hrms.service.FamilyServiceI;
import com.hrms.util.renderData;

@Controller
@RequestMapping("/family")
public class FamilyController {

	@Autowired
	private FamilyMapper FamilyMapper;

	@Autowired
	private FamilyServiceI familyService;
	
	@RequestMapping("add")
	@ResponseBody
	public String add(Family family) {
		int row = familyService.add(family);
		if(row>0) {
			return String.valueOf(family.getId());
		}else {
			return "F";
		}
	}
	
	@RequestMapping("getbyname_id_idnumber")
	@ResponseBody
	public void getEmpFamilyByENI(ModelMap model, @RequestParam(value = "employeeNum") String employeeNum_search,
			@RequestParam(value = "name") String name_search, @RequestParam(value = "idnumber") String idnumber_search,
			HttpServletResponse response, String page,
			String limit) {
		List<Family> employee_Family = familyService.selectFamilyByNNIusePage(employeeNum_search, name_search, idnumber_search, page, limit);
		model.put("data", employee_Family);
		model.put("status", 0);
		model.put("Family", "");
		model.put("total", familyService.getEmployeeByNNITotal(employeeNum_search, name_search, idnumber_search));
		renderData.render_Data(response, model);
	}

	@RequestMapping("getbyid") // 只会是一条数据,查看详细资料或修改回填时
	public void getEmpFamilyById(HttpServletRequest request, String id, HttpServletResponse response,ModelMap model) {// 可获取到值
		Family employee_Family = familyService.getFamilywithMessagebyid(Integer.parseInt(id));
		model.put("data", employee_Family);
		renderData.render_Data(response, model);
	}

	@RequestMapping("edit")
	@ResponseBody
	public String editEmpFamily(Family Family) {
		int row = familyService.uptEmpFamily(Family);
		if (row > 0) {
			return "success";
		}
		return "false";
	}

	@RequestMapping("del")
	@ResponseBody
	public String delEmpFamily(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		int row = FamilyMapper.deleteByMap(map);
		if (row > 0) {
			return "success";
		}
		return "false";
	}
	
	@RequestMapping("getbyMap")
	@ResponseBody
	public void getbyMap(Family family,String page,String limit ,ModelMap model,HttpServletResponse response) {
		List<Family> families = familyService.getByMap(family,page,limit);
		int total = familyService.countByMap(family);
		model.put("data", families);
		model.put("total", total);
		model.put("msg", "");
		model.put("status", 0);
		renderData.render_Data(response, model);
	}

	@RequestMapping("getEmployeeFamilybyPage")
	public String getAllEmpFamily(ModelMap model, String page, String limit) {
		List<Family> employee_Family = familyService.getEmployeeFamilybyPage(page, limit);
		model.put("data", employee_Family);
		model.put("status", 0);
		model.put("Family", "");
		model.put("total", familyService.getEmployeeFamilyTotal());
		return "emp_Family.html";
	}

}
