/* Write your T-SQL query statement below */
select 
e.name,
b.bonus
from Employee as e
LEFT JOIN Bonus as b
on e.empId = b.empId
WHERE b.bonus is null or b.bonus< 1000