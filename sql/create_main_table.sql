CREATE TABLE `level_plus_one`.`main` (
  `game_id` INT UNSIGNED NOT NULL,
  `character` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`game_id`, `character`),
  CONSTRAINT `main_game_id`
    FOREIGN KEY (`game_id`)
    REFERENCES `level_plus_one`.`game_info` (`game_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);
