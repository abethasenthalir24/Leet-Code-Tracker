-- Last updated: 7/17/2026, 2:57:04 PM
# Write your MySQL query statement below

SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
) t;

