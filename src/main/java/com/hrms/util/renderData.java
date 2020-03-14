package com.hrms.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;

import com.alibaba.fastjson.JSON;

public class renderData {
	
	public static ModelMap resp_Layui(List data,int total,ModelMap model) {
		model.put("data", data);
		model.put("total", total);
		model.put("msg", "");
		model.put("status", 0);
		return model;
	}
	

	/**
	 * 通过PrintWriter将响应数据写入response,ajax可以接受到这个数据
	 * 
	 * @param response
	 * @param data
	 */
	public static void render_Data(HttpServletResponse response, ModelMap model) {
		PrintWriter printWriter = null;
		String jsonResult = JSON.toJSONString(model);
		response.setContentType("text/html;charset=UTF-8");
		try {
			printWriter = response.getWriter();
			printWriter.print(jsonResult);
		} catch (IOException ex) {
		} finally {
			if (null != printWriter) {
				printWriter.flush();
				printWriter.close();
			}
		}
	}
}
