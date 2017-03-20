/*SELECT * FROM citizen.citizen;
select count(*) people_sum from citizen.citizen;
SELECT * FROM citizen.citizen ORDER BY first_Name;
select *from  citizen.citizen;
--insert into citizen(age,`first_Name`,`last_Name`,street_id)
--values (25,'Dmitriy','Ivanov',3);
delete from citizen where id=4460;
select street.strret_Name, count(street.strret_name) from
citizen.street group by strret_name order by(street.strret_name);
select distinct age, `last_Name` from citizen order by `last_Name`;*/

select*from citizen.courses;
select *from citizen.courses where title like '%ubuntu%';
select *from  citizen.employees;
select * from tangibles where (title like '%стол%' and price < 1300) or (title not like '%стол%' and price >1000);






