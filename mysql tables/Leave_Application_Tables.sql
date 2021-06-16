use sqlnew;

drop table if exists Leave_Details;

drop table if exists employ;

create table Employ
(
   empno int auto_increment,
   Ename varchar(30),
   job varchar(30),
   date_of_join date,
   salary numeric(9,2),
   Mobile varchar(20),
   primary key(empno)
);

Insert into Employ(ename,job,date_of_join,salary,mobile)
values('Anand','UI','2019-12-12',88255,'8882442122'),
('Apparao','Java','2020-01-12',88677,'882378443'),
('Sai Kiran','Java','2019-12-31',78944,'882556'),
('Chandrika','UI','2020-12-31',88822,'887764333'),
('Rekha','UI','2021-01-01',88522,'887212445'),
('Manikanta','Java','2020-12-12',88211,'98522482823');

select * from Employ;

Create Table Leave_Details
(
  leaveId INT AUTO_INCREMENT,
  empno int references Employ(empno),
  leaveStartDate Date,
  leaveEndDate Date,
  noOfDays INT,
  leaveType ENUM('EL','PL','ML') default 'EL',
  leaveStatus ENUM('PENDING','APPROVED','REJECTED') DEFAULT 'PENDING',
  managerComments varchar(30),
  primary key(leaveId)
);

INSERT INTO Leave_DETAILS(EMPNO,leaveStartDate,leaveEndDate) 
values(1,'2021-10-10','2021-10-12'),
(2,'2021-07-07','2021-08-08'),
(1,'2021-09-08','2021-09-08'),
(3,'2021-12-12','2021-12-12'),
(3,'2021-11-11','2021-11-11'),
(2,'2023-12-12','2023-12-25'),
(4,'2021-12-12','2021-12-23'),
(3,'2023-12-12','2023-11-11');

select * from Leave_Details;
