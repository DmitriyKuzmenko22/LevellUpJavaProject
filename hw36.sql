select*from factory.courses;
/*вывести 3-х человек с самой большой зарплатой (из таблицы employees)*/
select*from factory.employees order by salary desc limit 0,3;
/*2. вывести департаменты и количество человек в каждом*/
select dep.title, count(emp.department_id) as count from departments dep join employees emp on 
dep.id = emp.department_id group by emp.department_id;
/*вывести департаменты в которых работает больше 1-го человека*/
select dep.title, count(emp.department_id) as count from departments dep join employees emp on 
dep.id = emp.department_id group by emp.department_id having count>1;
/*вывести 2-х сотрудников с самыми большими суммарными зарплатами в 2015 году*/
select distinct employees.id, (select sum(salaries_paid.salary) from salaries_paid where
salaries_paid.employee_id=employees.id) as max_salarys from employees, 
salaries_paid order by max_salarys desc limit 2;
/*вывести сотрудников, кто не ходил ни на один курс*/
select*from employees left join employees_courses
 on employees.id=employees_courses.employee_id WHERE employees_courses.employee_id IS NULL
    LIMIT 0,30;
 /*вывести сотрудников кто ходил на 2 и более курса*/
select *from employees join employees_courses on employees.id=employees_courses.employee_id 
group by employee_id having count(employees_courses.employee_id)>1;
/*вывести самую массовую должность (неплохо бы добавить может ещё пару человек в базу)*/
select posts.title, count(posts.title) from posts inner join employees on employees.post_id=posts.id
group by posts.title desc limit 1;
select * from posts  join employees on employees.post_id=posts.id group by posts.title desc limit 1;
/* подсчитать среднее количество материальных ценностей, приходящихся на сотрудника*/
select avg(tangibles.price) from employees_tangibles join tangibles on employees_tangibles.employee_id=
tangibles.id;
/*найти самую часто встречающуюся материальную ценность у сотрудников (монитор, комп или что-то другое)*/
select tangibles.title, employees_tangibles.tangible_id, count(employees_tangibles.tangible_id) 
from tangibles left join employees_tangibles on tangibles.id=employees_tangibles.employee_id 
join employees on employees_tangibles.employee_id = employees.id
group by employees_tangibles.tangible_id desc limit 1;
/* найти департамент, сотрудники которого имеют самую большую сумму материальных ценностей*/


