package com.hrms.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrms.entity.Dictionary;
import com.hrms.service.DictionaryServiceI;
import com.hrms.util.renderData;

@Controller
@RequestMapping("dictionary")
public class DictionaryController {
	
	@Autowired
	private DictionaryServiceI dictionaryService;
	
	@RequestMapping("get")
	@ResponseBody
	public void get(Dictionary dictionary,String page,String limit,ModelMap model,HttpServletResponse response) {
		List<Dictionary> dictionaries = dictionaryService.getDictionary(dictionary, page, limit);
		int total = dictionaryService.countDictionary(dictionary);
		renderData.render_Data(response, renderData.resp_Layui(dictionaries,total,model));
	}
	
	@RequestMapping("add")
	@ResponseBody
	public String add(Dictionary dictionary) {
		int row = dictionaryService.insertDictionary(dictionary);
		if(row>0) {
			return "T";
		}else {
			return "F";
		}
	}
	
	@RequestMapping("del")
	@ResponseBody
	public String del(int id) {
		int row = dictionaryService.deleteDictionaryByid(id);
		if(row>0) {
			return "T";
		}else {
			return "F";
		}
	}
	
	@RequestMapping("upt")
	@ResponseBody
	public String upt(Dictionary dictionary,String id,String key,String value) {
		int row = dictionaryService.updateDictionary(dictionary, id, key, value);
		if(row>0) {
			return "T";
		}else {
			return "F";
		}
	}

}
