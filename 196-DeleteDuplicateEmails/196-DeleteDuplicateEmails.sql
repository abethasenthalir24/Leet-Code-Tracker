-- Last updated: 7/17/2026, 2:58:04 PM
# Write your MySQL query statement below
DELETE p
FROM Person p
JOIN Person p2
ON p.email = p2.email
AND p.id > p2.id;
