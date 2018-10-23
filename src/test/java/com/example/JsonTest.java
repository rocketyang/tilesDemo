/**
 * 
 */
package com.example;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.Assert;

/**
 * @author rocket
 *
 */
public class JsonTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JsonTest.class);
	@Test
	public void test() throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		Teacher teacher  = new Teacher();
		teacher.name = "rocket";
		teacher.age = 25;
		String str = "{\"person\": {\"name\":\"Bob\", \"age\":13, \"man\": {\"id\": 111, \"school\": {\"level\": 333}}}}";
		//Map<String, Object> obj = mapper.readValue(str,new TypeReference<Map<String, Object>>(){});
		Object obj = mapper.readValue(str, Class.forName("java.util.Map"));
		
		Object p1 = PropertyUtils.getProperty(obj, "person.man.school.level");
	    Assert.assertEquals(p1, 333);
		Object p2 = PropertyUtils.getProperty(obj, "person.man.school.aa");
		Assert.assertEquals(p2, null);
		LOGGER.info("hello");
	}
	public class DynamicBean {
		
	}
	public class Teacher {
		
		private String name;
		private int age;
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}
	}

}
