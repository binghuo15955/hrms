package hrms.test.Mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.hrms.entity.Family;
import com.hrms.mapper.FamilyMapper;

import hrms.test.TestCase;

public class TestFamilyMapper extends TestCase{

	@Autowired
	private FamilyMapper familyMapper;
	
	@Test
	public void TestfamilyMapper() {//@TableId(type = IdType.INPUT)
		Family family=new Family();
		family.setEmployeeNum("12312");
		//family.setId(2);
		familyMapper.insert(family);
	}
	@Test
	public void TestFamilysearchbyidnameidnumber() {//error sql synt: +ÅÐ¶ÏÌõ¼þ NULLºÍ""
		System.out.println(familyMapper.selectFamilyByNNIusePage("", "4", "", "0", "5"));
	}
	@Test
	public void TestINsertReturnID() {
		Family family = new Family();
		family.setAddress("3333222223");
		int row =familyMapper.insertAndgetPK(family);
		System.err.println(family.getId());
	}
}
