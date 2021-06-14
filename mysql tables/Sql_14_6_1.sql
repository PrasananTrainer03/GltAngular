desc Dept;

desc Emp;

select Dept.Deptno,Dname,Emp.Empno,ename,job,sal
FROM Dept INNER JOIN EMP ON Dept.Deptno=Emp.Deptno;

select D.DeptNo,Dname,Empno,Ename,job,Sal
FROM Dept D INNER JOIN EMP E ON D.DeptNo=E.Deptno;

desc Agent;

desc Policy;

desc AgentPolicy;

SELECT Agent.AgentId,FirstName,lastname,city,state,
Policy.PolicyId,AppNumber,ModalPremium,AnnualPremium
FROM Agent INNER JOIN AgentPolicy 
ON Agent.AgentID=AgentPolicy.AgentId
INNER JOIN Policy ON 
Policy.PolicyID = AgentPolicy.PolicyID;

SELECT A.AgentID,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
FROM Agent A INNER JOIN AgentPolicy AP 
ON A.AgentId=AP.AgentID 
INNER JOIN Policy P ON 
P.PolicyID=Ap.PolicyID 