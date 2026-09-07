/* Write your T-SQL query statement below */
SELECT user_id,
COUNT(follower_id) AS followers_count
from Followers
group by user_id