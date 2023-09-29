CREATE DATABASE padel;

USE padel;

CREATE TABLE user(
    email varchar(50) PRIMARY KEY not null,
    password varchar(50) not null,
    name varchar(20),
    surname varchar(100),
    DNI varchar(9) unique,
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
    email varchar(50),
    courtId int,
    day date,
    hour int,
    status enum("FREE", "PAID", "BOOKED", "BLOCKED", "CANCELLED"),
    PRIMARY KEY (bookingId, email, courtId),
    FOREIGN KEY (email) REFERENCES user(email),
    FOREIGN KEY (courtId) REFERENCES court(courtId)
);

INSERT INTO user (name, email, password, isActive, isAdmin) 
VALUES("admin", "admin@admin.com", md5("admin"), 1, 1);

INSERT INTO `user` (`name`, `surname`, `DNI`, `email`, `password`, `isActive`, `isAdmin`) 
VALUES ('test', 'test', '54545454B', 'test@gmail.com', md5('test'), '1', '0')