CREATE DATABASE IF NOT EXISTS padel;

USE padel;

CREATE TABLE IF NOT EXISTS user(
    email varchar(255) PRIMARY KEY not null,
    password varchar(255) not null,
    name varchar(255),
    surname varchar(255),
    DNI varchar(9) unique,
    isActive tinyint(1) not null,
    isAdmin tinyint(1) not null
);

CREATE TABLE court(
    courtId int PRIMARY KEY AUTO_INCREMENT,
    notes varchar(255),
    isAvailable tinyint(1)
);

CREATE TABLE booking(
    bookingId int AUTO_INCREMENT,
    userEmail varchar(255) not null,
    courtId int,
    day date,
    hour int,
    status tinyint(1) not null,
    PRIMARY KEY (bookingId, userEmail, courtId),
    FOREIGN KEY (userEmail) REFERENCES user(email),
    FOREIGN KEY (courtId) REFERENCES court(courtId)
);

INSERT INTO user (name, email, password, isActive, isAdmin) 
VALUES("admin", "admin@gmail.com", md5("admin"), 1, 1);

INSERT INTO `user` (`name`, `surname`, `DNI`, `email`, `password`, `isActive`, `isAdmin`) 
VALUES ('Name', 'Lastnames', '54545454B', 'user@gmail.com', md5('user'), '1', '0')