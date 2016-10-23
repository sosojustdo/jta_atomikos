package com.test.atomikos.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: 收藏实体
 * All Rights Reserved.
 * @version 1.0  2016年8月30日 下午3:09:02  by 代鹏（daipeng.456@gmail.com）创建
 */
public class Collect implements Serializable{
	
	private static final long serialVersionUID = 7808302408841321969L;
	
	/**
	 * 收藏主键id
	 */
	private Long collectionId;
	
	/**
	 * 收藏主体id
	 */
    private Long collectionTargetId;
    
    /**
     * 收藏类似id
     */
    private Long operationTypeId;
    
    /**
     * 收藏用户id
     */
    private Long userId;
    
    /**
     * 收藏时间
     */
    private Date creationDate;
    
    public Collect() {
		super();
	}

	public Collect(Long collectionId, Long collectionTargetId, Long operationTypeId, Long userId, Date creationDate) {
		this.collectionId = collectionId;
		this.collectionTargetId = collectionTargetId;
		this.operationTypeId = operationTypeId;
		this.userId = userId;
		this.creationDate = creationDate;
	}

	public Collect(Long collectionTargetId, Long operationTypeId, Long userId, Date creationDate) {
		this.collectionTargetId = collectionTargetId;
		this.operationTypeId = operationTypeId;
		this.userId = userId;
		this.creationDate = creationDate;
	}

	public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    public Long getCollectionTargetId() {
        return collectionTargetId;
    }

    public void setCollectionTargetId(Long collectionTargetId) {
        this.collectionTargetId = collectionTargetId;
    }

    public Long getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(Long operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}