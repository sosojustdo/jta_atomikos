package com.test.atomikos.service.impl;

import java.util.Date;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.atomikos.icatch.jta.UserTransactionManager;
import com.test.atomikos.a.dao.CollectionMapper;
import com.test.atomikos.b.dao.PostMapper;
import com.test.atomikos.model.Collect;
import com.test.atomikos.model.Post;
import com.test.atomikos.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	private CollectionMapper collectionMapper;
	
	@Autowired
	private PostMapper postMapper;

	@Override
	public void testTransaction(ApplicationContext context) {
		UserTransactionManager utm = (UserTransactionManager) context.getBean("atomikosTransactionManager");
		try {
            utm.begin();
            
            Collect collect = new Collect(9999999999L, 4L, 1111111L, new Date());
    		int effect_rows = collectionMapper.insert(collect);
    		Assert.assertTrue(effect_rows > 0);
    		
    		Post post = new Post();
    		post.setPostTypeId(1L);
    		post.setPostContent("测试发帖");
    		post.setStatus(1);
    		post.setCreationDate(new Date());
    		int effect_rows1 = postMapper.insert(post);
    		Assert.assertTrue(effect_rows1 > 0);
    		
    		//制造异常，让事务回滚
    		System.out.println(1/0);
            
            utm.commit();
        } catch (NotSupportedException | SystemException
                | SecurityException | IllegalStateException | HeuristicMixedException | HeuristicRollbackException | javax.transaction.RollbackException e) {
            e.printStackTrace();
            try {
                utm.rollback();
            } catch (IllegalStateException | SecurityException | SystemException e1) {
                e1.printStackTrace();
            }
        }
	}

}
