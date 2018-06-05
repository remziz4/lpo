CREATE TABLE level_plus_one.`user_profile` (
  `user_id` int(10) unsigned NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `avatar_uri` varchar(120) DEFAULT NULL,
  `biography` varchar(2500) DEFAULT NULL,
  `twitter` varchar(30) DEFAULT NULL,
  `discord` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `user_profile_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8
