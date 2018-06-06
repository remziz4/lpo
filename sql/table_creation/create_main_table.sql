CREATE TABLE level_plus_one.`main` (
  `main_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `game_id` int(10) unsigned NOT NULL,
  `character` varchar(45) NOT NULL,
  PRIMARY KEY (`main_id`),
  UNIQUE KEY `unique_game_id_character` (`game_id`,`character`),
  CONSTRAINT `main_game_id` FOREIGN KEY (`game_id`) REFERENCES `game_info` (`game_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
