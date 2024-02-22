REM   Script: 19/02/2024
REM   sql

select * from scott.emp;

select distinct deptno  from scott.emp;

select empno,ename, d,deptno,dname 
from scott.emp e 
right join scott.dpt d 
on e.deptno=d.depth;

select distinct deptno  from scott.emp;

select empno,ename, d,deptno,dname 
  from scott.emp e 
  right join scott.dpt d 
  on e.deptno=d.depth;

selectc * from hr.employees where department_id is null;


select count(distinct department_id) from hr.departments;

select count(distinct department_id) from hr.employees;

select employee_id,frist_name,last_name, d.department_id,department_name 
  from hr.employees e 
  inner join hr.departments d 
  on e.department_id=d.department_id;

select employee_id,first_name,last_name, d.department_id,department_name 
  from hr.employees e 
  inner join hr.departments d 
  on e.department_id=d.department_id;

select employee_id,first_name,last_name, d.department_id,department_name 
  from hr.employees e 
  right outer  join hr.departments d 
  on e.department_id=d.department_id;

select employee_id,first_name,last_name, d.department_id,department_name 
  from hr.employees e 
  right outer  join hr.departments d 
  on e.department_id=d.department_id;

select employee_id,first_name,last_name, d.department_id,department_name 
  from hr.employees e 
  left outer  join hr.departments d 
  on e.department_id=d.department_id;

select employee_id,first_name,last_name, d.department_id,department_name 
  from hr.employees e 
  full outer  join hr.departments d 
  on e.department_id=d.department_id;

select count(*) from hr.departments;

select count(*) from hr.employees where department_is is null;

select count(*) from hr.employees where department_id is null;

select employee_id,first_name,last_name, d.department_id,department_name 
  from hr.employees e 
  full outer  join hr.departments d 
  on e.department_id=d.department_id 
    order by employee_id;

