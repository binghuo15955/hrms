package hrms.test.Service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.entity.Family;
import com.hrms.service.FamilyServiceI;

import hrms.test.TestCase;

public class TestFamilyService extends TestCase{

	@Autowired
	private FamilyServiceI familyService;
	

	@Test
	public void Test_getByMap() {
		Family family = new Family();
		String page="1";
		String limit="5";
		//family.setEmployeeNum("0");
		family.setIdnumber("34");
		family.setTelephone("453");
		List<Family> families=familyService.getByMap(family, page, limit);
		System.err.println(families.size());
	}
}
