package hrms.test.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.entity.Family;
import com.hrms.entity.Message;
import com.hrms.mapper.MessageMapper;
import com.hrms.service.MessageDetailServiceI;
import com.hrms.service.MessageServiceI;

import hrms.test.TestCase;


public class MessageTest extends TestCase{
	
	@Autowired
	private MessageMapper MessageMapper;
	@Autowired
	private MessageServiceI messageService;
	@Autowired
	private MessageDetailServiceI messageDetailService;
	
	@Test
	public void TestgetMessageDetailService() {
		List<Family> families=new ArrayList<>();
		Family family1=new Family();
		family1.setName("1");
		Family family2=new Family();
		family2.setName("2");
		families.add(family1);
		families.add(family2);
	}
	
	


}
