package com.hrms.service;

import java.util.List;

import com.hrms.entity.Dictionary;

public interface DictionaryServiceI {
	/**
	 * ����һ����Ŀ
	 * @param dictionary
	 * @return
	 */
	int insertDictionary(Dictionary dictionary);
	/**
	 * ������ĿIDɾ����Ӧ��Ŀ
	 * @param id
	 * @return
	 */
	int deleteDictionaryByid(int id);
	/**
	 * ����ID������Ŀ
	 * @param dictionary
	 * @return
	 */
	int updateDictionary(Dictionary dictionary, String id,String key, String value);
	/**
	 * ����dictionary������ȡdictionary����ҳ��
	 * @param dictionary
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Dictionary> getDictionary(Dictionary dictionary,String page,String limit);
	/**
	 * ������������ȡDictionary������Ŀ��
	 * @return
	 */
	int countDictionary(Dictionary dictionary);
	
	
}
