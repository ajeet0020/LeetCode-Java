# Write your MySQL query statement below
with cte_high_earner as
(
    select departmentId,
    name,
    salary,
    dense_rank() over(partition by departmentId order by salary desc) as salary_rank
    from Employee
)
select d.name as Department,
che.name as Employee,
che.salary as Salary
from cte_high_earner as che
join Department as d
on che.departmentId = d.id
where che.salary_rank <= 3;
