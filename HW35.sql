SELECT * FROM citizen.citizen;
select count(*) people_sum from citizen.citizen; /*общее число жителей*/
/*SELECT * FROM citizen.citizen ORDER BY age;*/
select*from citizen.citizen; /*выводим всю таблицу*/
select avg(age) from citizen.citizen; /*средний возраст*/
SELECT * FROM citizen.citizen ORDER BY first_Name; /*фильтр по имени*/
select distinct age from citizen.citizen order by last_Name;/*фильтр возраста по имени*/
SELECT last_Name, count(last_Name) FROM citizen.citizen GROUP BY last_Name
HAVING count(*) > 0 ORDER BY count(*); /*выводим количество повторяющихся фамилий и их фимилии*/
select last_Name from citizen.citizen where last_Name like '%н%'; /*находим фимилии с буквой н*/
select last_Name from citizen.citizen where last_Name like 'горохов_';
select*from citizen.citizen where street_id is null; /*выводим список людей без прописки*/
select last_Name from citizen.citizen where age<18; /*жители которым менее 18*/
select distinct street.strret_name from citizen.street where strret_name like '______'; /*название улиц 6 символов*/

SELECT street.strret_name, count(street.strret_name) FROM citizen.street GROUP BY strret_name
HAVING count(*) <3 ORDER BY count(*); /*название улиц на которых менее 3- жителей*/

select street.strret_name, count(street.id_client) 
from citizen.street group by strret_name order by(street.strret_name); /*выводим улицы в алфавитном порядке и коо-во жителей*/
/******************************************************************************************/
SELECT * FROM citizen.citizen WHERE age='33';
    
select * from citizen.citizen, citizen.street where citizen.id=street.id_client;
select*from citizen.citizen inner join citizen.street on street.id_client=citizen.id where
citizen.age<30;

SELECT * FROM citizen.citizen WHERE first_Name LIKE 'А%';
select*from citizen.citizen where street_id is null;