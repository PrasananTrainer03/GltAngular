-- String Functions 

-- instr() : Displays the first occurrence of given char in a string

select INSTR('Ravali','a') ;

select ENAME, INSTR(Ename,'A') FROM EMP;

-- Lenght() : displays total no.of chars 

select length('Srikanth');

select Ename,length(Ename) from Emp;

-- Reverse() : Displays the string in reverse order 

select reverse('rekha');

select ename,reverse(ename) from Emp;

-- Left : Displays no.of left side chars 

select LEFT('Srikanth',4);

-- Right : Displays no.of right side chars 

select RIGHT('Srikanth',4);

-- Lower : Used to display in lower case 

select lower('Srikanth'); 

-- upper : Used to display in upper case 

select upper('Srikanth');

-- substring() : Used to display the part of the string. 

select substring('welcome to sql',3,5);

-- from 3rd char inclusive print next 5 chars

-- Replace() : used to replace old char/word with new char/word in all occurrences

select replace('Java Training','Java','MySql');

