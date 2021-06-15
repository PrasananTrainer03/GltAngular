drop database if exists sqlnew;

create database sqlnew;

use sqlnew;

drop table if exists Employ;

create table Employ
(
   empno int,
   name varchar(30),
   dept varchar(30),
   desig varchar(30),
   basic numeric(9,2),
   primary key(empno)
);

insert into Employ(empno,name,dept,desig,basic) 
values(1,'Pravin','Java','Programmer',88234),
(2,'Anand','UI','Developer',99233),
(3,'Apparao','Java','Expert',99922),
(4,'Manikanta','Java','Programmer',99111),
(5,'Ravali','UI','Programmer',99223),
(6,'Srikanth','UI','Developer',99145),
(7,'Venu','Java','Programmer',58521);

select * from Employ;