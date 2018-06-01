CREATE TABLE `level_plus_one`.`user` (
  `user_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(80) NOT NULL,
  `enabled` TINYINT(1) NOT NULL,
  `last_login` DATETIME NULL,
  `registration_date` DATETIME NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);