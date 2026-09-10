

/* Write your T-SQL query statement below */

select  
w.id
from Weather as w
left join Weather as s 
  ON DATEDIFF(DAY, s.recordDate, w.recordDate) = 1
WHERE w.temperature > s.temperature;