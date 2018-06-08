CREATE TABLE level_plus_one.`user_coaching_info` (
  `user_id` int(10) unsigned NOT NULL,
  `tagline` varchar(80),
  `rate_type` varchar(50) NOT NULL,
  `rate` decimal DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `user_coaching_info_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
