package com.hrms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.sql.visitor.functions.If;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.hrms.entity.Bank;
import com.hrms.entity.Family;
import com.hrms.mapper.FamilyMapper;
import com.hrms.service.FamilyServiceI;

@Service("familyService")
public class FamilyServiceImpl implements FamilyServiceI {

	@Autowired
	private FamilyMapper FamilyMapper;

	public Family getFamilywithMessagebyid(int id) {
		return FamilyMapper.getFamilywithMessagebyid(id);
	}

	@Override
	public int uptEmpFamily(Family family) {
		return FamilyMapper.updateByPrimaryKeySelective(family);
	}

	public List<Family> selectFamilyByNNIusePage(String employeeNum, String m_name, String m_idnumber, String page,
			String limit) {
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p = (p - 1) * l;
		page = String.valueOf(p);
		return FamilyMapper.selectFamilyByNNIusePage(employeeNum, m_name, m_idnumber, page, limit);
	}

	@Override
	public List<Family> getEmployeeFamilybyPage(String page, String limit) {
		if (page == null && limit == null) {
			return null;
		}
		// 计算开始的item编号
		int p = Integer.parseInt(page);
		int l = Integer.parseInt(limit);
		p = (p - 1) * l;
		page = String.valueOf(p);
		List<Family> list = FamilyMapper.getFamilywithMessage(page, limit);
		return list;
	}

	@Override
	public int getEmployeeFamilyTotal() {
		return FamilyMapper.getEmployeeFamilyTotal();
	}

	public int getEmployeeByNNITotal(String employeeNum, String m_name, String m_idnumber) {
		return FamilyMapper.getEmployeeByNNITotal(employeeNum, m_name, m_idnumber);
	}

	@Override
	public int add(Family family) {
		return FamilyMapper.insertAndgetPK(family);
	}

	@Override
	public List<Family> getByMap(Family family, String page, String limit) {
		if (page != null && !"".equals(page) && limit != null && !"".equals(limit)) {
			PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
		}
		QueryWrapper<Family> queryWrapper = new QueryWrapper<Family>();
		if (family.getEmployeeNum() != null && !"".equals(family.getEmployeeNum())) {
			queryWrapper.like("employeeNum", family.getEmployeeNum());
		}
		if (family.getName() != null && !"".equals(family.getName())) {
			queryWrapper.like("name", family.getName());
		}
		if (family.getCompany() != null && !"".equals(family.getCompany())) {
			queryWrapper.like("company", family.getCompany());
		}
		if (family.getPosition() != null && !"".equals(family.getPosition())) {
			queryWrapper.like("position", family.getPosition());
		}
		if (family.getIdnumber() != null && !"".equals(family.getIdnumber())) {
			queryWrapper.like("idnumber", family.getIdnumber());
		}
		if (family.getTelephone() != null && !"".equals(family.getTelephone())) {
			queryWrapper.like("telephone", family.getTelephone());
		}
		return FamilyMapper.selectList(queryWrapper);
	}

	@Override
	public int countByMap(Family family) {
		QueryWrapper<Family> queryWrapper = new QueryWrapper<Family>();
		if (family.getEmployeeNum() != null && !"".equals(family.getEmployeeNum())) {
			queryWrapper.like("employeeNum", family.getEmployeeNum());
		} else if (family.getName() != null && !"".equals(family.getName())) {
			queryWrapper.like("name", family.getName());
		} else if (family.getCompany() != null && !"".equals(family.getCompany())) {
			queryWrapper.like("company", family.getCompany());
		} else if (family.getPosition() != null && !"".equals(family.getPosition())) {
			queryWrapper.like("position", family.getPosition());
		} else if (family.getIdnumber() != null && !"".equals(family.getIdnumber())) {
			queryWrapper.like("idnumber", family.getIdnumber());
		} else if (family.getTelephone() != null && !"".equals(family.getTelephone())) {
			queryWrapper.like("telephone", family.getTelephone());
		}
		return FamilyMapper.selectCount(queryWrapper);
	}

}
