-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: May 26, 2023 at 05:18 PM
-- Server version: 5.7.32
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `example`
--

-- --------------------------------------------------------
CREATE DATABASE IF NOT EXISTS example;

--
-- Table structure for table `fruits`
--

CREATE TABLE `fruits`
(
    `id`         int(11)        NOT NULL,
    `name`       varchar(255)   NOT NULL,
    `price`      decimal(10, 2) NOT NULL,
    `bestBefore` date           NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

--
-- Dumping data for table `fruits`
--

INSERT INTO `fruits` (`id`, `name`, `price`, `bestBefore`)
VALUES (1, 'Pastéque', '0.60', '2026-05-26'),
       (2, 'Kiwi', '1.00', '2023-05-26');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fruits`
--
ALTER TABLE `fruits`
    ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fruits`
--
ALTER TABLE `fruits`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,
    AUTO_INCREMENT = 2;
