USE `llb_community`;

DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `post_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `post_type_id` bigint(20) NOT NULL COMMENT '帖子类型id,0:图文贴,1:问题贴',
  `post_title` varchar(200)  DEFAULT NULL COMMENT '帖子标题用于展示使用',
  `post_show_count` int(11) DEFAULT NULL COMMENT '帖子浏览数',
  `post_share_count` int(11) DEFAULT NULL COMMENT '帖子分享数',
  `post_forward_count` int(11) DEFAULT NULL COMMENT '帖子转发数',
  `post_content` varchar(8000)  NOT NULL COMMENT '帖子正文JSON内容,包括图片文字',
  `forward_post_id` bigint(20) DEFAULT NULL COMMENT '转发原贴id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '发帖人用户id',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '帖子状态:0:删除,1:正常',
  `creation_date` datetime NOT NULL COMMENT '帖子发布时间',
  `is_top` int(11) DEFAULT '0' COMMENT '是否置顶:0:否,1:是',
  `top_expire_date` datetime DEFAULT NULL COMMENT '置顶失效时间',
  `is_elite` int(11) DEFAULT '0' COMMENT '是否加精:0:否,1:是',
  `is_recommend` int(11) DEFAULT '0' COMMENT '是否推荐:0:否,1:是',
  `is_public` int(11) DEFAULT '0' COMMENT '是否公告:0:否,1:是',
  `last_modifyed_date` datetime DEFAULT NULL COMMENT '帖子最后修改时间',
  `operator_user_id` bigint(20) DEFAULT NULL COMMENT '帖子编辑人id',
  `operator_desc` int(11) DEFAULT NULL COMMENT '帖子删除操作描述',
  PRIMARY KEY (`post_id`),
  KEY `idx_creation_date` (`creation_date`) USING BTREE,
  KEY `idx_user_id` (`user_id`) USING BTREE,
  KEY `idx_status` (`status`) USING BTREE,
  KEY `idx_is_top` (`is_top`) USING BTREE,
  KEY `idx_is_elite` (`is_elite`) USING BTREE,
  KEY `idx_is_public` (`is_public`) USING BTREE,
  KEY `idx_is_recommend` (`is_recommend`) USING BTREE
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='帖子';