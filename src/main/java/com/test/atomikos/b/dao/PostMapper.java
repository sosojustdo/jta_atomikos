package com.test.atomikos.b.dao;

import com.test.atomikos.model.Post;

public interface PostMapper {
	
    int deleteByPrimaryKey(Long postId);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Long postId);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
    
}