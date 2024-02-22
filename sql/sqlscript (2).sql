REM   Script: testing sql
REM   sql

SELECT empno, ename, sal, deptno 
FROM scott.emp e 
WHERE sal > ( 
    SELECT AVG(sal) 
    FROM scott.emp 
    WHERE deptno = e.deptno 
);

