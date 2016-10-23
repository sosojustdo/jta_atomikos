package com.unit.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/applicationContext-common.xml" })
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)  
//@Transactional
public abstract class BaseTest {

}