CREATE TABLE level_plus_one.`coach_game_info` (
  `user_id` int(10) unsigned NOT NULL,
  `coach_game_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `game` varchar(50) NOT NULL,
  `competing_since` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`coach_game_id`),
  UNIQUE KEY `unique_user_id_game` (`user_id`,`game`),
  CONSTRAINT `coach_game_info_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
