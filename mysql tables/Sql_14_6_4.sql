select job from Emp; 

select distinct job from Emp;

select job,count(*) from 
Emp group by job
having count(*) > 1;

select job,sum(sal) from 
Emp group by job
having sum(sal) > 5000;


select job,max(sal) from 
Emp group by job;

select job,min(sal) from
Emp group by job;