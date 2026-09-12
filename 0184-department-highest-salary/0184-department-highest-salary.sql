# Write your MySQL query statement below
with cte_highest_department as
(
    select departmentId,
    max(salary) as max_salary
    from Employee
    group by departmentId
)
select d.name as Department,
e.name as Employee,
chd.max_salary as Salary
from Employee as e
join cte_highest_department as chd
on e.departmentId = chd.departmentId
And e.salary = chd.max_salary
join Department as d
 ON e.departmentId = d.id;
