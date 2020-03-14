package hrms.test.Mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.mapper.ExperienceMapper;
import com.hrms.service.ExperienceServiceI;
import com.hrms.util.DateUtils;

import hrms.test.TestCase;

public class TestExperienceMapper extends TestCase{

	@Autowired
	private ExperienceMapper experienceMapper;
	@Autowired
	private ExperienceServiceI experienceService;
	
	@Test
	public void TestGetbyname_id_idnumber() throws Exception {
		System.out.println("heelo");
		experienceService.selectExperienceByENISECPusePage(null, null, null, "2020-01-08", null, null, null, "1", "5");
	}
	
	@Test
	public void TestDateformatter() {
		String date="2020-01-01";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate=LocalDate.parse(date, formatter);
		System.out.println(DateUtils.LocalDateToDate(localDate));
	}
	
	@Test
	public void Test_selectExperienceByENISECPusePage() {
		String start_time1="2020-03-01";
		String end_time1="2020-03-04";
		String position="";

		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate start_time = null,end_time = null;
		if(!"".equals(start_time1)&&start_time1!=null) {
			start_time=LocalDate.parse(start_time1, formatter);
		}
		if(!"".equals(end_time1)&&end_time1!=null) {
			end_time=LocalDate.parse(end_time1, formatter);
		}
		
		experienceMapper.selectExperienceByENISECPusePage("", null, null, start_time, end_time, null, position, "0", "10");
	}
}
