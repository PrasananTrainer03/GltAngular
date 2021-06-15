select * from Emp;

-- Display the max. salary 

select max(sal) from Emp;

-- Display the name of person who is getting max. salary 

select ename from Emp where sal=max(sal);

-- 0	8	14:22:03	select ename from Emp where sal=max(sal)
 -- LIMIT 0, 1000	Error Code: 1111. Invalid use of group function	0.016 sec
 
 select ename from Emp where sal = (select max(sal) from Emp);
 
 -- Display the 2nd maximum salary 
 
 select max(sal) from emp where sal < (select max(sal) from Emp);
 
 -- Display Name of the person who is getting 2nd max. salary 
 
 select ename from emp where sal =(
 select max(sal) from emp where sal < (select max(sal) from Emp) 
 );
 
 select * from Agent;
 
 select * from AgentPolicy;
 
 select * from Agent WHERE AgentID <> ALL
 (select AgentID From agentpolicy);
 
 -- Display IDLE policies
 
 select * from Policy WHERE PolicyID <> ALL
 (select PolicyID From agentpolicy);
 
 -- Display all Agent Records which are present in Agent and AgentPolicy Tables
 
 select * from Agent where AgentID = ANY
 (select AgentID from AgentPolicy);
 
 -- Display all Policy Records which are present in Both Policy and AgentPolicy
 -- Tables
 
 select * from Policy WHERE PolicyID = ANY
 (select PolicyID from AgentPolicy);
 
 