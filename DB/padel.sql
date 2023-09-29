CREATE DATABASE IF NOT EXISTS padel;

USE padel;

<<<<<<< HEAD
CREATE TABLE IF NOT EXISTS user(
    email varchar(255) PRIMARY KEY not null,
    password varchar(255) not null,
    name varchar(255),
    surname varchar(255),
=======
CREATE TABLE user(
    email varchar(50) PRIMARY KEY not null,
    password varchar(50) not null,
    name varchar(20),
    surname varchar(100),
>>>>>>> 858b3aea33e186ca468a5f0e1ff7fa89002e8ada
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
<<<<<<< HEAD
    userEmail varchar(255) not null,
    courtId int,
    day date,
    hour int,
    status tinyint(1) not null,
    PRIMARY KEY (bookingId, userEmail, courtId),
    FOREIGN KEY (userEmail) REFERENCES user(email),
=======
    email varchar(50),
    courtId int,
    day date,
    hour int,
    status enum("FREE", "PAID", "BOOKED", "BLOCKED", "CANCELLED"),
    PRIMARY KEY (bookingId, email, courtId),
    FOREIGN KEY (email) REFERENCES user(email),
>>>>>>> 858b3aea33e186ca468a5f0e1ff7fa89002e8ada
    FOREIGN KEY (courtId) REFERENCES court(courtId)
);

INSERT INTO user (name, email, password, isActive, isAdmin) 
VALUES("admin", "admin@gmail.com", md5("admin"), 1, 1);

INSERT INTO `user` (`name`, `surname`, `DNI`, `email`, `password`, `isActive`, `isAdmin`) 
VALUES ('Name', 'Lastnames', '54545454B', 'user@gmail.com', md5('user'), '1', '0')