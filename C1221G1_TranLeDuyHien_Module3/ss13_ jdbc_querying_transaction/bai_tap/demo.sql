create database demo;
use demo;

create table demos(
id int primary key auto_increment,
`name` varchar(50),
email varchar(50),
country varchar(50)
);

insert into demos(`name`,email,country) 
values('Truong','changtraitre2000@gmail.com','Da Nang');
insert into demos(`name`,email,country) 
values('Dinh','changtraitre1993@gmail.com','Hue');
insert into demos(`name`,email,country) 
values('Khoa','changtraitre2003@gmail.com','Da Nang');