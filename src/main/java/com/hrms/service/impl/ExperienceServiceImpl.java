package com.hrms.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.entity.Experience;
import com.hrms.mapper.ExperienceMapper;
import com.hrms.service.ExperienceServiceI;

@Service("experienceService")
public class ExperienceServiceImpl implements ExperienceServiceI {

	@Autowired
	private ExperienceMapper ExperienceMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hrms.service.impl.ExperienceServiceI#getExperiencewithMessagebyid(int)
	 */
	@Override
	public Experience getExperiencewithMessagebyid(int id) {
		return ExperienceMapper.selectById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hrms.service.impl.ExperienceServiceI#uptEmpExperience(com.hrms.entity.
	 * Experience)
	 */
	@Override
	public int uptEmpExperience(Experience experience) {
		return ExperienceMapper.updateByPrimaryKeySelective(experience);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hrms.service.impl.ExperienceServiceI#selectExperienceByENISECPusePage(
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<Experience> selectExperienceByENISECPusePage(String employeeNum, String m_name, String m_idnumber,
			String start_time1, String end_time1, String company, String position, String page, String limit)
			throws Exception {
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p = (p - 1) * l;
		page = String.valueOf(p);
		//时间格式化
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate start_time = null,end_time = null;
		if(!"".equals(start_time1)&&start_time1!=null) {
			start_time=LocalDate.parse(start_time1, formatter);
		}
		if(!"".equals(end_time1)&&end_time1!=null) {
			end_time=LocalDate.parse(end_time1, formatter);
		}
		
		return ExperienceMapper.selectExperienceByENISECPusePage(employeeNum, m_name, m_idnumber, start_time, end_time,
				company, position, page, limit);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hrms.service.impl.ExperienceServiceI#getEmployeeExperiencebyPage(java.
	 * lang.String, java.lang.String)
	 */
	@Override
	public List<Experience> getEmployeeExperiencebyPage(String page, String limit) {
		if (page == null && limit == null) {
			return null;
		}
		// 计算开始的item编号
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p = (p - 1) * l;
		page = String.valueOf(p);
		List<Experience> list = ExperienceMapper.getEmployeeExperiencebyPage(page, limit);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hrms.service.impl.ExperienceServiceI#getEmployeeExperienceTotal()
	 */
	@Override
	public int getEmployeeExperienceTotal() {
		return ExperienceMapper.getEmployeeExperienceTotal();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hrms.service.impl.ExperienceServiceI#getEmployeeByENISECPTotal(java.lang.
	 * String, java.lang.String, java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public int getEmployeeByENISECPTotal(String employeeNum, String m_name, String m_idnumber, String start_time1,
			String end_time1, String company, String position) throws Exception {
		//时间格式化
				DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate start_time = null,end_time = null;
				if(!"".equals(start_time1)&&start_time1!=null) {
					start_time=LocalDate.parse(start_time1, formatter);
				}
				if(!"".equals(end_time1)&&end_time1!=null) {
					end_time=LocalDate.parse(end_time1, formatter);
				}
		return ExperienceMapper.getEmployeeByENISECPTotal(employeeNum, m_name, m_idnumber, start_time, end_time,
				company, position);
	}

	@Override
	public int add(Experience experience) {
		return ExperienceMapper.insertAndgetPK(experience);
	}

	@Override
	public List<Experience> getByMap(Experience experience) {
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("employeeNum", experience.getEmployeeNum());
		return ExperienceMapper.selectByMap(map);
	}

}