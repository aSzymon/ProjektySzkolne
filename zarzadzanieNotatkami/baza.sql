-- Aleksandra Banasiewicz
-- Klasa 4pp
-- nr 1

CREATE DATABASE Klasa4pp;

USE Klasa4pp;

CREATE TABLE notatki (
    id INT PRIMARY KEY AUTO_INCREMENT,
    notatka VARCHAR(225) NOT NULL,
    dataWprowadzenia DATE NOT NULL,
    dataWaznosciDo DATE NOT NULL
);