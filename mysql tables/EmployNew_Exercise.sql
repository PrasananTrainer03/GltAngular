Create table EmployNew
(   
   empno int auto_increment primary key,   
   ename varchar(30),
   job varchar(30),
   mstat enum('0','1'),
   city varchar(30),
   salary numeric(9,2)
);

INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Vaibhav', 'UI', '1', 'Chennai', '84825');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Krishna Chandrika', 'UI', '0', 'Hyderabad', '78944');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Ramadugu Ravali', 'Java', '1', 'Hyderabad', '78111');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Srikanth Reddy Dendi', 'Angular', '0', 'Hyderbad', '89122');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Suhaas', 'Angular', '0', 'Bangalore', '98224');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Sai Kiran Chatlapalli', 'UI', '0', 'Bangalore', '78234');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Manoj Yekolla', 'Java', '0', 'Hyderabad', '78455');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Rekha', 'UI', '1', 'Chennai', '78222');
INSERT INTO `glt`.`employnew` (`ename`, `job`, `mstat`, `city`, `salary`) VALUES ('Apparao ', 'Java', '0', 'Chennai', '88244');