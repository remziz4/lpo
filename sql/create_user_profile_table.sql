CREATE TABLE `level_plus_one`.`profile_info` (
  `user_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `avatar_uri` VARCHAR(120) NULL,
  `biography` VARCHAR(2500) NULL,
  `twitter` VARCHAR(30) NULL,
  `discord` VARCHAR(30) NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `user_profile_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `level_plus_one`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);
