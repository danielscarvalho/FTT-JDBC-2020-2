create database ftt;

use ftt;

CREATE TABLE `ftt`.`user` (
  `userId` INT NOT NULL,
  `userName` VARCHAR(500) NULL,
  `userColor` VARCHAR(45) NULL,
  `userCar` VARCHAR(45) NULL,
  `userDob` DATETIME NULL,
  `userEmail` VARCHAR(250) NULL,
  PRIMARY KEY (`userId`));

select * from user;

CREATE USER 'scott'@'localhost' IDENTIFIED BY 'EsqEJP5jmbYy6eSj';

GRANT ALL ON ftt.* TO 'scott'@'localhost';

GRANT ALL PRIVILEGES ON *.* TO 'scott'@'localhost';
