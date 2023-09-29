CREATE DATABASE padel;

USE padel;

CREATE TABLE user(
    userId int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20),
    surname1 varchar(30),
    surname2 varchar(30),
    DNI varchar(9) unique,
    birthDate date,
    email varchar(20) unique not null,
    password varchar(50) not null,
    isActive tinyint(1) not null,
    isAdmin tinyint(1) not null
);

CREATE TABLE court(
    courtId int PRIMARY KEY AUTO_INCREMENT,
    name varchar(20),
    isAvailable tinyint(1)
);

CREATE TABLE booking(
    bookingId int AUTO_INCREMENT,
    userId int,
    courtId int,
    day date,
    hour int,
    status enum("FREE", "PAID", "BOOKED", "BLOCKED", "CANCELLED"),
    PRIMARY KEY (bookingId, userId, courtId),
    FOREIGN KEY (userId) REFERENCES user(userId),
    FOREIGN KEY (courtId) REFERENCES court(courtId)
);

INSERT INTO user (name, email, password, isActive, isAdmin) 
VALUES("admin", "admin@admin.com", md5("admin"), 1, 1);

INSERT INTO `user` (`name`, `surname1`, `surname2`, `DNI`, `email`, `birthDate`, `password`, `isActive`, `isAdmin`) 
VALUES ('test', 'test', 'test', '54545454B', 'test@gmail.com', '0000-00-00', md5('test'), '1', '0')