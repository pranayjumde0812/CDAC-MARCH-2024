CREATE TABLE `ecommerce`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `unitprice` DOUBLE NULL,
  `imageurl` VARCHAR(45) NULL,
  `quantity` INT NULL,
  PRIMARY KEY (`id`)
  );