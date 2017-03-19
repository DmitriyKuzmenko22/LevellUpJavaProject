select*from citizen.employees;
select *from citizen.courses where title like '%ubuntu%';
select*from citizen.employees LIMIT 2,3;
select * from citizen.employees order by salary desc limit 1,1;
SELECT name_last, count(name_last) FROM citizen.employees GROUP BY name_last
HAVING count(*) > 1;
select*from citizen.tangibles where tangibles.price>570;
select*from citizen.salaries_paid where salary>=1200 or salary<100;
select max(salary), min(salary), count(*)employe_sum from citizen.employees;
select*from salaries_paid where not date_pay in('2015-08-01', '2015-03-01')  ;

select*from citizen.tangibles where tangibles.price<1300 and tangibles.title like('стол%') order by price;
select*from citizen.tangibles; 
select*from citizen.employees;