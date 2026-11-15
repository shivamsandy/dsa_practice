/* Write your T-SQL query statement below */
SELECT
uni.unique_id ,
e.name
from Employees as e
left join EmployeeUNI as uni
on e.id  = uni.id
