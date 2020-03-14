package hrms.test.Mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hrms.entity.Dictionary;
import com.hrms.mapper.DictionaryMapper;

import hrms.test.TestCase;

public class TestDictionaryMapper extends TestCase {

	@Autowired
	private DictionaryMapper dictionaryMapper;
	
	@Test
	public void TestADD() {
		Dictionary dictionary = new Dictionary();
		dictionary.setClassification("����");
		dictionary.setEditable("��");
		dictionary.setItem("shi");
		dictionary.setValue("��5");
		dictionaryMapper.insert(dictionary);
	}
	@Test
	public void Testupdate() {
		Dictionary dictionary = new Dictionary();
		dictionary.setClassification("����");
		dictionary.setEditable("��");
		dictionary.setItem("shi");
		dictionary.setValue("��");
		UpdateWrapper<Dictionary> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("id", 1);
		dictionaryMapper.update(dictionary, updateWrapper);
	}
	
}
