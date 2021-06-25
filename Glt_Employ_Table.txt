create table Employ
(
   Empno INT primary key,
   Name varchar(30),
   Dept varchar(30),
   Desig varchar(30),
   Basic INT
);

Insert into Employ values(1,'subhadip','java',
'programmer',48233);

insert into Employ values(3,'Madhu','Sql',
'developer',48231);

insert into Employ values(4,'Namit','Java',
'Programmer',82522);
commit;