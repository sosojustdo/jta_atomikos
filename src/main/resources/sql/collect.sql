USE `llb_ugc`;

DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `collection_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `collection_target_id` bigint(20) NOT NULL COMMENT '收藏主体id',
  `operation_type_id` bigint(20) NOT NULL COMMENT '收藏操作类型id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `creation_date` datetime NOT NULL COMMENT '收藏时间',
  PRIMARY KEY (`collection_id`),
  KEY `idx_user_id` (`user_id`) USING BTREE,
  KEY `idx_collection_target_id` (`collection_target_id`) USING BTREE,
  KEY `idx_operation_type_id` (`operation_type_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='收藏记录表';