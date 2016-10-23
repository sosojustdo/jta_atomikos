package com.unit.test.examples;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.atomikos.service.TestService;
import com.unit.test.base.BaseTest;

public class AtomikosTransactionTest extends BaseTest {
	
	@Autowired
	private TestService testService;
	
	@Before
	public void check_bean_is_not_null(){
		Assert.assertNotNull(testService);
	}
	
	@Test
	public void test_multiple_operate_db_transaction(){
		ApplicationContext context =new ClassPathXmlApplicationContext("/spring/applicationContext-common.xml");
		testService.testTransaction(context);
	}

}
