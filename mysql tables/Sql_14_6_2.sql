select D.DeptNo,Dname,Empno,Ename,job,Sal
FROM Dept D INNER JOIN EMP E ON D.DeptNo=E.Deptno;

-- Example for LEFT OUTER JOIN
select D.Deptno,Dname,Empno,Ename,Job,Sal
FROM Dept D LEFT JOIN EMP E ON D.Deptno=E.Deptno;

SELECT Agent.AgentId,FirstName,lastname,city,state,
Policy.PolicyId,AppNumber,ModalPremium,AnnualPremium
FROM Agent LEFT JOIN AgentPolicy 
ON Agent.AgentID=AgentPolicy.AgentId
LEFT JOIN Policy ON 
Policy.PolicyID = AgentPolicy.PolicyID;

select A.AgentID,FirstName,LastName,City,State,
P.PolicyId,AppNumber,ModalPremium,AnnualPremium
FROM Agent A LEFT JOIN AgentPolicy AP 
ON A.AgentID=AP.AgentID 
LEFT JOIN Policy P ON 
P.PolicyID = AP.PolicyID;


-- Example for RIGHT OUTER JOIN 

select D.Deptno,Dname,Empno,Ename,Job,Sal
from Dept D RIGHT JOIN EMP E ON D.Deptno=E.Deptno;

SELECT Agent.AgentId,FirstName,lastname,city,state,
Policy.PolicyId,AppNumber,ModalPremium,AnnualPremium
FROM Agent RIGHT JOIN AgentPolicy 
ON Agent.AgentID=AgentPolicy.AgentId
RIGHT JOIN Policy ON 
Policy.PolicyID = AgentPolicy.PolicyID;
