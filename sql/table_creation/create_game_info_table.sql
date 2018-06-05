CREATE TABLE level_plus_one.`game_info` (
  `user_id` int(10) unsigned NOT NULL,
  `game_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `game` varchar(50) NOT NULL,
  `competing_since` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`game_id`),
  UNIQUE KEY `unique_user_id_role` (`user_id`,`game`),
  CONSTRAINT `game_info_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
