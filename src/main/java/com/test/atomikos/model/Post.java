package com.test.atomikos.model;

import java.io.Serializable;
import java.util.Date;
/**
 * Description:帖子信息 
 * Copyright (c) Department of Research and Development/Beijing
 * All Rights Reserved.
 * @version 1.0  2016年8月18日 下午2:58:29  by 杨雷（yanglei@cloud-young.com）创建
 */
public class Post implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long postId;//帖子id
    
    private Long forwardPostId;//转发原贴id
    
    private Long postTypeId;//帖子类型id

    private String postTitle;//帖子标题

    private String postContent;//图文混排帖子内容

    private Integer status;//帖子状态:0:删除,1:正常

    private Integer postShowCount;//帖子浏览数

    private Integer postShareCount;//帖子分享数

    private Integer postForwardCount;//帖子转发数

    private Integer isTop;//是否置顶:0:否,1:是

    private Date topExpireDate;//置顶失效时间

    private Integer isElite;//是否加精:0:否,1:是

    private Integer isRecommend;//是否推荐:0:否,1:是
    
    private Integer isPublic;//是否公告:0:否,1:是

    private Long userId;//贴主id
    
    private Date creationDate;//帖子发布时间

    private Date lastModifyedDate;//帖子最后修改时间

    private Long operatorUserId;//帖子最后编辑人id
    
    private Integer operatorDesc;//帖子删除描述枚举id

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getForwardPostId() {
		return forwardPostId;
	}

	public void setForwardPostId(Long forwardPostId) {
		this.forwardPostId = forwardPostId;
	}

	public Long getPostTypeId() {
		return postTypeId;
	}

	public void setPostTypeId(Long postTypeId) {
		this.postTypeId = postTypeId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPostShowCount() {
		return postShowCount;
	}

	public void setPostShowCount(Integer postShowCount) {
		this.postShowCount = postShowCount;
	}

	public Integer getPostShareCount() {
		return postShareCount;
	}

	public void setPostShareCount(Integer postShareCount) {
		this.postShareCount = postShareCount;
	}

	public Integer getPostForwardCount() {
		return postForwardCount;
	}

	public void setPostForwardCount(Integer postForwardCount) {
		this.postForwardCount = postForwardCount;
	}

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	public Date getTopExpireDate() {
		return topExpireDate;
	}

	public void setTopExpireDate(Date topExpireDate) {
		this.topExpireDate = topExpireDate;
	}

	public Integer getIsElite() {
		return isElite;
	}

	public void setIsElite(Integer isElite) {
		this.isElite = isElite;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}
	
	public Integer getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
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

	public Date getLastModifyedDate() {
		return lastModifyedDate;
	}

	public void setLastModifyedDate(Date lastModifyedDate) {
		this.lastModifyedDate = lastModifyedDate;
	}

	public Long getOperatorUserId() {
		return operatorUserId;
	}

	public void setOperatorUserId(Long operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

	public Integer getOperatorDesc() {
		return operatorDesc;
	}

	public void setOperatorDesc(Integer operatorDesc) {
		this.operatorDesc = operatorDesc;
	}
	
}