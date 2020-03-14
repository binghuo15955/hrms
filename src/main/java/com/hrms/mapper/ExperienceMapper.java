package com.hrms.mapper;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrms.entity.Experience;

public interface ExperienceMapper extends BaseMapper<Experience> {
	public int updateByPrimaryKeySelective(Experience experience);
	/**
	 * ͨ��id��ȡԱ����Ϣ
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	Experience getExperiencewithMessagebyid(@Param("id") int id);

	/**
	 * ͨ���������š�Ա�����������֤�š���ʼʱ�䡢����ʱ�䡢��λ���ơ���λ���������&��ҳ
	 * @param employeeNum
	 * @param m_name
	 * @param m_idnumber
	 * @param start_time
	 * @param end_time
	 * @param company
	 * @param position
	 * @param page
	 * @param limit
	 * @return
	 */
	 
	List<Experience> selectExperienceByENISECPusePage(@Param("employeeNum") String employeeNum,
			@Param("name") String m_name, @Param("idnumber") String m_idnumber, @Param("start_time") LocalDate start_time,
			@Param("end_time") LocalDate end_time, @Param("company") String company, @Param("position") String position,
			@Param("page") String page, @Param("limit") String limit);

	/**
	 * ��ȡ����Ա����������&��ҳ
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	List<Experience> getEmployeeExperiencebyPage(@Param("page") String page, @Param("limit") String limit);

	/**
	 * ��ȡԱ����ͥ��Ϣ����
	 * 
	 * @return
	 */
	int getEmployeeExperienceTotal();

	/**
	 * ��������������ȡԱ������
	 * @param employeeNum
	 * @param m_name
	 * @param m_idnumber
	 * @param start_time
	 * @param end_time
	 * @param company
	 * @param position
	 * @return
	 */
	int getEmployeeByENISECPTotal(@Param("employeeNum") String employeeNum,
			@Param("name") String m_name, @Param("idnumber") String m_idnumber, @Param("start_time") LocalDate start_time,
			@Param("end_time") LocalDate end_time, @Param("company") String company, @Param("position") String position);
	/**
	 * ��Ӳ�����ID
	 * @param experience
	 * @return
	 */
	public int insertAndgetPK(Experience experience);
}