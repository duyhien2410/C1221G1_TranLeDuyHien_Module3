CREATE DATABASE `student_management`;
use  `student_management`;
create table `student`(
`id` int PRIMARY KEY,
`name` varchar(45) ,
`age` int not null,
`country` varchar(45) 
 );
 create table `class` (
 `id` int PRIMARY KEY,
 `name` varchar(45)
 );
 create table `teacher` (
 `id` int PRIMARY KEY,
 `name` varchar(45),
 `age` int not null,
 `country` varchar(45)
 );