CREATE TABLE level_plus_one.`specialty` (
  `specialty_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `coach_game_id` int(10) unsigned NOT NULL,
  `character` varchar(45) NOT NULL,
  PRIMARY KEY (`specialty_id`),
  UNIQUE KEY `unique_coach_game_id_character` (`coach_game_id`,`character`),
  CONSTRAINT `specialty_coach_game_id` FOREIGN KEY (`coach_game_id`) REFERENCES `coach_game_info` (`coach_game_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
