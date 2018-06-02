CREATE TABLE `level_plus_one`.`session` (
  `session_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `student_user_id` INT UNSIGNED NOT NULL,
  `coach_user_id` INT UNSIGNED NOT NULL,
  `start_date` DATETIME NOT NULL,
  `duration` INT UNSIGNED NULL,
  `creation_date` DATETIME NOT NULL,
  PRIMARY KEY (`session_id`),
  INDEX `session_student_user_id_idx` (`student_user_id` ASC),
  INDEX `session_coach_user_id_idx` (`coach_user_id` ASC),
  CONSTRAINT `session_student_user_id`
    FOREIGN KEY (`student_user_id`)
    REFERENCES `level_plus_one`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `session_coach_user_id`
    FOREIGN KEY (`coach_user_id`)
    REFERENCES `level_plus_one`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
