-- Active: 1745600980635@@127.0.0.1@1521@SYSTEM
select * from employees;

select first_name || ' ' || last_name as full_name, SALARY from EMPLOYEES where SALARY > 10000;