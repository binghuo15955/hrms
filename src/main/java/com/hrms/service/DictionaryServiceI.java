package com.hrms.service;

import java.util.List;

import com.hrms.entity.Dictionary;

public interface DictionaryServiceI {
	/**
	 * 插入一条条目
	 * @param dictionary
	 * @return
	 */
	int insertDictionary(Dictionary dictionary);
	/**
	 * 根据条目ID删除对应条目
	 * @param id
	 * @return
	 */
	int deleteDictionaryByid(int id);
	/**
	 * 根据ID更新条目
	 * @param dictionary
	 * @return
	 */
	int updateDictionary(Dictionary dictionary, String id,String key, String value);
	/**
	 * 根据dictionary条件获取dictionary（分页）
	 * @param dictionary
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Dictionary> getDictionary(Dictionary dictionary,String page,String limit);
	/**
	 * 根据条件，获取Dictionary里总条目数
	 * @return
	 */
	int countDictionary(Dictionary dictionary);
	
	
}
