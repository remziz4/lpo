CREATE TABLE `level_plus_one`.`game_info` (
  `user_id` INT UNSIGNED NOT NULL,
  `game_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `game` VARCHAR(50) NOT NULL,
  `competing_since` VARCHAR(45) NULL,
  PRIMARY KEY (`game_id`),
  CONSTRAINT `game_info_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `level_plus_one`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);


ALTER TABLE `level_plus_one`.game_info ADD UNIQUE `unique_user_id_role`(`user_id`, `game`);