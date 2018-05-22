package com.yang.mbgen;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yang.model.UserInfo;
import com.yang.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	// private ApplicationContext ac=null;
	@Resource(name="userService")
	private UserService userService;
	/*
	 * @Before public void before() { ac=new
	 * ClassPathXmlApplicationContext("applicationContext.xml");
	 * userService=(UserService) ac.getBean("userService"); }
	 */

	@Test
	public void test1() {
		UserInfo user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
}
