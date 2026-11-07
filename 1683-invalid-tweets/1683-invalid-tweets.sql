-- # Write your MySQL query statement below
-- select 
-- tweet_id
-- from Tweets
-- where LEN(content)>15

/* Write your T-SQL query statement below */
-- select 
-- tweet_id 
-- from Tweets 
-- where LEN(content) >15 


SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15;