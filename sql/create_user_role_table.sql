CREATE TABLE `level_plus_one`.`user_role` (
  `user_id` INT UNSIGNED NOT NULL,
  `user_role_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`user_role_id`, `user_id`),
  CONSTRAINT `user_role_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `level_plus_one`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);
    
ALTER TABLE `level_plus_one`.user_role ADD UNIQUE `unique_user_id_role`(`user_id`, `role`);