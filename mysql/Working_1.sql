use glt;

select * from Emp;

-- Display empno, ename, job,sal from Emp table

select Empno,Ename,Job,Sal
From Emp;

-- Where clause  : used to filter data from the given table(s)

select Empno,Ename,Job,Sal
FROM EMP WhERE SAL >=3000;

-- Display all records whose Job is 'CLERK' 

select * from Emp where job='CLERK';

-- Display all records whose ename is 'ADAMS' 

select * from Emp where ename='ADAMS';

-- Display all records whose job is 'SALESMAN';

select * from Emp where job='SALESMAN';

-- BETWEEN...AND : used to display records from start...end range 

select * from Emp where SAL BETWEEN 1000 AND 3000;

select * from Emp where SAL NOT BETWEEN 1000 AND 3000;

-- IN CLAUSE : Used to display particular column records. 

select * from EMP 
WHERE JOB IN('CLERK','MANAGER');

select * from EMP 
WHERE ENAME IN('SCOTT','FORD','ADAMS','JAMES');

select * from EMP 
WHERE JOB NOT IN('CLERK','MANAGER');

select * from EMP 
WHERE ENAME NOT IN('SCOTT','FORD','ADAMS','JAMES');

-- LIKE Operator : Used to display values w.r. Wild cards 

-- Display all records whose name starts with 's' 

select * from Emp Where ENAME LIKE 'S%';

-- Display ALL RECORDs Whose Name Ends with 's'

select * from Emp where ENAME LIKE '%S';

-- Display all records whose First Char is 'J' and 5th char is 'S' 

select * from Emp where ENAME LIke 'J___S';

-- ORDER BY : Used to display records w.r.t. Specific field(s) in ascending or descending order 

select Empno,Ename,Job,SAl,MGR from Emp;

select Empno, Ename, Job, SAL, MGR 
FROM EMP ORDER BY Ename;

select Empno, Ename, Job, SAL, MGR 
FROM EMP ORDER BY JOB;

select Empno, Ename, Job, SAL, MGR 
FROM EMP ORDER BY JOB, ENAME;

select Empno, Ename, Job, SAL, MGR 
FROM EMP ORDER BY JOB, ENAME DESC;

select Empno,Ename,job,Sal,Deptno from Emp;

-- How to eliminate duplicates at the time of display we need the help of DISTINCT keyword. 

select JOB From Emp;

select distinct JOB From EMP;

select Empno,Ename,job,Sal,Deptno from Emp;

-- if deptno=10 then print Head as 'Lingaraj'
-- if deptno=20 then print Head as 'Vandana'
-- if deptno=30 then print head as 'Ramakrishna' 

select Empno,Ename,job,Sal,Deptno,
CASE DEPTNO 
   WHEN 10 then 'Lingaraj'
   WHEN 20 THEN 'Vandana'
   WHEN 30 THEN 'Ramakrishna'
   else 'Not Found'
END 'Manager'
FROM EMP;

select Empno,Ename,Job,Sal,comm from Emp;

-- Write a commnad as if comm is null then put 0 there 

select Empno, Ename, Job, Sal, comm,
CASE WHEN COMM IS NULL THEN 0 
ELSE COMM
END  comm
FROM EMP;

select Empno, Ename, Job, Sal, comm,
CASE WHEN COMM IS NULL THEN 0 
ELSE COMM
END  comm,
CASE WHEN COMM IS NULL THEN SAL
ELSE SAL + COMM END 'TakeHome'
FROM EMP;

