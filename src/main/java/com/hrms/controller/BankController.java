package com.hrms.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.alibaba.fastjson.JSON;
import com.hrms.entity.Bank;
import com.hrms.mapper.BankMapper;
import com.hrms.service.BankServiceI;

@Controller
@RequestMapping("/bank")
public class BankController {

	@Autowired
	private BankMapper BankMapper;

	@Autowired
	private BankServiceI bankService;

	@RequestMapping("getbyname_id_idnumber_account_openbank")
	@ResponseBody
	public void getEmpBankByNNIT(ModelMap model, @RequestParam(value = "employeeNum") String employeeNum_search,
			@RequestParam(value = "name") String name_search, @RequestParam(value = "idnumber") String idnumber_search,
			@RequestParam(value = "account") String account_search,@RequestParam(value = "openbank") String openbank_search, HttpServletResponse response, String page,
			String limit) {
		List<Bank> employee_Bank = bankService.selectBankByNNIAOusePage(employeeNum_search, name_search, idnumber_search, account_search, openbank_search, page, limit);
		model.put("data", employee_Bank);
		model.put("status", 0);
		model.put("Bank", "");
		model.put("total", bankService.getEmployeeBankByNNIAOTotal(employeeNum_search, name_search, idnumber_search, account_search, openbank_search));
		String jsonResult = JSON.toJSONString(model);
		response.setContentType("text/html;charset=UTF-8");
		renderData(response, jsonResult);
	}

	@RequestMapping("getbyid") // 只会是一条数据,查看详细资料或修改回填时
	public void getEmpBankById(HttpServletRequest request, String id, HttpServletResponse response) {// 可获取到值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		List<Bank> employee_Bank = BankMapper.selectByMap(map);
		Bank emp_Bank = employee_Bank.get(0);
		String jsonResult = JSON.toJSONString(emp_Bank);
		response.setContentType("text/html;charset=UTF-8");
		renderData(response, jsonResult);
	}

	@RequestMapping("edit")
	@ResponseBody
	public String editEmpBank(Bank Bank) {
		int row = BankMapper.updateById(Bank);
		System.out.println(row);
		if (row > 0) {
			return "success";
		}
		return "false";
	}

	@RequestMapping("del")
	@ResponseBody
	public String delEmpBank(String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		int row = BankMapper.deleteByMap(map);
		if (row > 0) {
			return "success";
		}
		return "false";
	}


	@RequestMapping("add")
	@ResponseBody
	public String add(Bank bank) {
		int row = bankService.add(bank);
		if(row>0) {
			return String.valueOf(bank.getId());
		}else {
			return "F";
		}
	}

	@RequestMapping("getEmployeeBankbyPage")
	public String getAllEmpBank(ModelMap model, String page, String limit) {
		List<Bank> employee_Bank = bankService.getEmployeeBankbyPage(page, limit);
		model.put("data", employee_Bank);
		model.put("status", 0);
		model.put("Bank", "");
		model.put("total", bankService.getEmployeeBankTotal());
		System.out.println(bankService.getEmployeeBankTotal());
		return "emp_bank.html";
	}

	/**
	 * 通过PrintWriter将响应数据写入response，ajax可以接受到这个数据
	 * 
	 * @param response
	 * @param data
	 */
	private void renderData(HttpServletResponse response, String data) {
		PrintWriter printWriter = null;
		try {
			printWriter = response.getWriter();
			printWriter.print(data);
		} catch (IOException ex) {
		} finally {
			if (null != printWriter) {
				printWriter.flush();
				printWriter.close();
			}
		}
	}
}
