CREATE TABLE `voter_application_jdbc`.`candidates`
(
    `candidate_id` INT NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(20) NULL,
    `votes`        INT NULL,
    PRIMARY KEY (`candidate_id`)
);