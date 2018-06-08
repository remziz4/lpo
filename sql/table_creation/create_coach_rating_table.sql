CREATE TABLE level_plus_one.`coach_rating` (
  `user_id` int(10) unsigned NOT NULL,
  `rating` decimal,
  `submitted_by` int(10) unsigned NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `coach_rating_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `submitted_by_user_id` FOREIGN KEY (`submitted_by`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
