CREATE TABLE `voter_application_jdbc`.`users`
(
    `user_id`    INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(20) NULL,
    `last_name`  VARCHAR(20) NULL,
    `email`      VARCHAR(20) NULL,
    `password`   VARCHAR(20) NULL,
    `dob`        DATE NULL,
    `status`     TINYINT NULL,
    `role`       VARCHAR(20) NULL,
    PRIMARY KEY (`user_id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE
);