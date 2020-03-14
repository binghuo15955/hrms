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
		dictionary.setClassification("分类");
		dictionary.setEditable("是");
		dictionary.setItem("shi");
		dictionary.setValue("是5");
		dictionaryMapper.insert(dictionary);
	}
	@Test
	public void Testupdate() {
		Dictionary dictionary = new Dictionary();
		dictionary.setClassification("分类");
		dictionary.setEditable("否");
		dictionary.setItem("shi");
		dictionary.setValue("是");
		UpdateWrapper<Dictionary> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("id", 1);
		dictionaryMapper.update(dictionary, updateWrapper);
	}
	
}
