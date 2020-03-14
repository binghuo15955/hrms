package com.hrms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hrms.entity.Bank;
import com.hrms.entity.Experience;
import com.hrms.entity.Family;
import com.hrms.mapper.BankMapper;
import com.hrms.mapper.ExperienceMapper;
import com.hrms.mapper.FamilyMapper;
import com.hrms.service.MessageDetailServiceI;

@Service("messageDetailService")
public class MessageDetailServiceImpl implements MessageDetailServiceI {

	@Autowired
	private FamilyMapper FamilyMapper;
	@Autowired
	private BankMapper BankMapper;
	@Autowired
	private ExperienceMapper ExperienceMapper;

	@Override
	public int addEmp_family_experience_bank(JSONArray jsonArray) {
		int allrow=0;
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject object = jsonArray.getJSONObject(i);
			String classification = (String) jsonArray.getJSONObject(i).get("classification");
			if("bank".equals(classification)) {
				Bank bank = new Bank();
				bank.setAccount(object.getString("account"));
				bank.setEmployeeNum(object.getString("employeeNum"));
				bank.setIdnumber(object.getString("idnumber"));
				bank.setName(object.getString("name"));
				bank.setOpenbank(object.getString("openbank"));
				int row = BankMapper.insert(bank);
				if(row>0) {
					allrow++;
					continue;
				}else {
					return -1;
				}
			}else if("experience".equals(classification)) {
				Experience experience=new Experience();
				experience.setCompany(object.getString("company"));
				experience.setDescription(object.getString("description"));
				experience.setEmployeeNum(object.getString("employeeNum"));
				experience.setEnd_time(object.getDate("end_time"));
				experience.setPosition(object.getString("position"));
				experience.setStart_time(object.getDate("start_time"));
				int row=ExperienceMapper.insert(experience);
				if(row>0) {
					allrow++;
					continue;
				}else {
					return -1;
				}
			}else if("family".equals(classification)){
				Family family=new Family();
				family.setAddress(object.getString("address"));
				family.setCompany(object.getString("company"));
				family.setEmployeeNum(object.getString("employeeNum"));
				family.setIdnumber(object.getString("idnumber"));
				family.setName(object.getString("name"));
				family.setPosition(object.getString("position"));
				family.setRelationship(object.getString("relationship"));
				family.setTelephone(object.getString("telephone"));
				int row=FamilyMapper.insert(family);
				if(row>0) {
					allrow++;
					continue;
				}else {
					return -1;
				}
			}
		}
		return allrow;
	}
	

}
