CREATE DATABASE IF NOT EXISTS padel;

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
    notes varchar(255),
    isAvailable tinyint(1)
);

CREATE TABLE booking(
    bookingId int AUTO_INCREMENT,
    email varchar(50),
    courtId int,
    day date,
    hour varchar(5),
    status enum("NOTPAID", "PAID", "BLOCKED", "CANCELLED"),
    PRIMARY KEY (bookingId, email, courtId),
    FOREIGN KEY (email) REFERENCES user(email),
    FOREIGN KEY (courtId) REFERENCES court(courtId)
);

INSERT INTO user (name, email, password, isActive, isAdmin) 
VALUES("admin", "admin@gmail.com", md5("admin"), 1, 1);

INSERT INTO `user` (`name`, `surname`, `DNI`, `email`, `password`, `isActive`, `isAdmin`) 
VALUES ('Name', 'Lastnames', '54545454B', 'user@gmail.com', md5('user'), '1', '0')