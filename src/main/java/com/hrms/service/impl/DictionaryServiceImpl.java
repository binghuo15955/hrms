package com.hrms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.github.pagehelper.PageHelper;
import com.hrms.entity.Dictionary;
import com.hrms.mapper.DictionaryMapper;
import com.hrms.service.DictionaryServiceI;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryServiceI {

	@Autowired
	private DictionaryMapper dictionaryMapper;

	@Override
	public int insertDictionary(Dictionary dictionary) {
		if ("on".equals(dictionary.getEditable())) {
			dictionary.setEditable("是");
		} else {
			dictionary.setEditable("否");
		}
		return dictionaryMapper.insert(dictionary);
	}

	@Override
	public int deleteDictionaryByid(int id) {
		return dictionaryMapper.deleteById(id);
	}

	@Override
	public int updateDictionary(Dictionary dictionary, String id, String key, String value) {
		UpdateWrapper<Dictionary> updateWrapper = new UpdateWrapper<Dictionary>();
		if (key != null && !"".equals(key)) {// 单元格修改方式
			dictionary.setValue(null);
			switch (key) {
			case "classification":
				dictionary.setClassification(value);
				break;
			case "item":
				dictionary.setItem(value);
				break;
			case "value":
				dictionary.setValue(value);
				break;
			case "editable":
				dictionary.setEditable(value);
				break;
			default:
				break;
			}
			updateWrapper.eq("id", id);
			return dictionaryMapper.update(dictionary, updateWrapper);
		} else {// 条目完整修改
			return dictionaryMapper.updateById(dictionary);
		}
	}

	@Override
	public List<Dictionary> getDictionary(Dictionary dictionary, String page, String limit) {
		QueryWrapper<Dictionary> queryWrapper = new QueryWrapper<>();
		// 设置分页
		if (page != null && limit != null && !"".equals(page) && !"".equals(limit)) {
			PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
		}
		// 判断查询条件
		if (dictionary.getClassification() != null) {
			queryWrapper.like("classification", dictionary.getClassification());
		}
		if (dictionary.getItem() != null) {
			queryWrapper.like("item", dictionary.getItem());
		}
		if (dictionary.getValue() != null) {
			queryWrapper.like("value", dictionary.getValue());
		}
		if (dictionary.getEditable() != null) {
			queryWrapper.like("editable", dictionary.getEditable());
		}
		queryWrapper.orderByAsc("classification");
		List<Dictionary> dictionaries = dictionaryMapper.selectList(queryWrapper);
		return dictionaries;
	}

	@Override
	public int countDictionary(Dictionary dictionary) {
		QueryWrapper<Dictionary> queryWrapper = new QueryWrapper<>();
		// 判断查询条件
		if (dictionary.getClassification() != null) {
			queryWrapper.like("classification", dictionary.getClassification());
		}
		if (dictionary.getItem() != null) {
			queryWrapper.like("item", dictionary.getItem());
		}
		if (dictionary.getValue() != null) {
			queryWrapper.like("value", dictionary.getValue());
		}
		if (dictionary.getEditable() != null) {
			queryWrapper.like("editable", dictionary.getEditable());
		}
		return dictionaryMapper.selectCount(queryWrapper);
	}

}
