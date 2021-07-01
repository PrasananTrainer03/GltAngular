create table Login
(
    userName varchar(30) primary key,
    passCode varchar(30) NOT  NULL
);

Insert into Login values('Ravali','Ramadugu'),
('Manikanta','Aravapalli'),('Apparao','sigireddy')

select count(*) cnt from Login where 
userName='Ravali' and passcode='Ramadugu'

select * from login;