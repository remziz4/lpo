CREATE TABLE `level_plus_one`.`main` (
  `main_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `game_id` INT UNSIGNED NOT NULL,
  `character` VARCHAR(45) NOT NULL,
  INDEX `main_game_id_idx` (`game_id` ASC),
  PRIMARY KEY (`main_id`),
  CONSTRAINT `main_game_id`
    FOREIGN KEY (`game_id`)
    REFERENCES `level_plus_one`.`game_info` (`game_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);

ALTER TABLE `level_plus_one`.main ADD UNIQUE `unique_game_id_character`(`game_id`, `character`);