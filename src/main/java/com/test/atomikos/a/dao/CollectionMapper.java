package com.test.atomikos.a.dao;

import com.test.atomikos.model.Collect;

public interface CollectionMapper {
	
    int deleteByPrimaryKey(Long collectionId);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Long collectionId);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
    
}