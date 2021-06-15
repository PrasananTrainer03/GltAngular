select empno,ename,job,mgr,sal from Emp;

select E1.Empno, E2.Empno,
E1.Ename,E2.Ename
from Emp E1 INNER JOIN Emp E2 
ON E1.Empno = E2.MGR
Order By E1.Empno;

select E1.Empno, E2.Empno,
E1.Ename,E2.Ename
from Emp E1 RIGHT JOIN Emp E2 
ON E1.Empno = E2.MGR
Order By E1.Empno;
