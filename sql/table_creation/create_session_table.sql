CREATE TABLE level_plus_one.`session` (
  `session_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `student_user_id` int(10) unsigned NOT NULL,
  `coach_user_id` int(10) unsigned NOT NULL,
  `start_date` datetime NOT NULL,
  `duration` int(10) unsigned DEFAULT NULL,
  `creation_date` datetime NOT NULL,
  `last_modified_date` datetime NOT NULL,
  PRIMARY KEY (`session_id`),
  KEY `session_student_user_id_idx` (`student_user_id`),
  KEY `session_coach_user_id_idx` (`coach_user_id`),
  CONSTRAINT `session_coach_user_id` FOREIGN KEY (`coach_user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `session_student_user_id` FOREIGN KEY (`student_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
