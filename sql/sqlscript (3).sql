REM   Script: sql mainframe-testing
REM   testing

select * from scott.emp;

select * from scott.emp;

select * from scott.emp where depno=30;

select * from scott.emp where deptno=30;

select empno,ename,job from scott.emp where deptno=30;

select empno,ename,job from scott.emp where deptno<30;

select empno,ename,job from scott.emp where deptno>10 and deptno <30;

select empno,ename,job from scott.emp where deptno>10 and deptno <30;

select empno,ename,job deptno  from scott.emp where deptno>10 and deptno <30;

select empno,ename,job, deptno  from scott.emp where deptno>10 and deptno <30;

select empno,ename,job, deptno  from scott.emp between deptno>10 and deptno <30;

select empno,ename,job, deptno  from scott.emp where deptno between 10 and 30;

select empno,ename,job, deptno  from scott.emp where deptno in(10,30);

select empno,ename,job, deptno  from scott.emp where deptno in(10,30);

select * from scott,emp;

select empno,ename,job, deptno  from scott.emp where deptno in(10,30);

select * from scott,emp;

select * from scott,emp where sal>1000;

select empno,ename,job, deptno  from scott.emp where deptno in(10,30);

select * from scot.emp;

select * from scott.emp where sal>1000;

