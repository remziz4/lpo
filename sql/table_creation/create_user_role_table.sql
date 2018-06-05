CREATE TABLE level_plus_one.`user_role` (
  `user_id` int(10) unsigned NOT NULL,
  `user_role_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `unique_user_id_role` (`user_id`,`role`),
  CONSTRAINT `user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
