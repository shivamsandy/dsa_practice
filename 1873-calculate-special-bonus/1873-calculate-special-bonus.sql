/* Write your T-SQL query statement below */
-- select 
-- employee_id,
-- bonus
-- from Employees
-- if(employee_id %2==0  or name like 'M'){
--     bonus =0;
-- }else{
--     bonus  = salary
-- }

SELECT
    employee_id,
    CASE
        WHEN employee_id % 2 = 0 THEN 0
        WHEN name LIKE 'M%' THEN 0
        ELSE salary
    END AS bonus
FROM Employees
ORDER BY employee_id;