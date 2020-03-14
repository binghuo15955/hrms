package hrms.test.Service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hrms.entity.Dictionary;
import com.hrms.service.DictionaryServiceI;

import hrms.test.TestCase;

public class TestDictionaryService extends TestCase {

	@Autowired
	private DictionaryServiceI dictionaryService;

	@Test
	public void TestUpdate() {// 单元格
		Dictionary dictionary = new Dictionary();
		// dictionary.setItem("修改成功吧！");

		String id = "1";
		String key = "classification";
		String value = "修改成功吧！";
		dictionaryService.updateDictionary(dictionary, id, key, value);
	}

	@Test
	public void TestUpdate1() {// 完整
		Dictionary dictionary = new Dictionary();
		dictionary.setId(1);
		dictionary.setClassification("分类");
		dictionary.setEditable("是");
		dictionary.setItem("shi");
		dictionary.setValue("Haode");

		String id = null;
		String key = null;
		String value = null;
		dictionaryService.updateDictionary(dictionary, id, key, value);
	}

	@Test
	public void Testselect() {// 完整
		Dictionary dictionary = new Dictionary();
		dictionary.setId(2);
		String page="1";
		String limit="3";
		List<Dictionary> dictionaries =  dictionaryService.getDictionary(dictionary, page, limit);
		System.err.println(dictionaries);
	}
	
	@Test
	public void Testcount() {// 完整
		Dictionary dictionary = new Dictionary();
		System.err.println(dictionaryService.countDictionary(dictionary));
	}
}
