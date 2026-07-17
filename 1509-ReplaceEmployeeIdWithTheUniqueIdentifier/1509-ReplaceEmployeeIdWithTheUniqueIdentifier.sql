-- Last updated: 7/17/2026, 2:56:06 PM
# Write your MySQL query statement below

SELECT 
    eu.unique_id,
    e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;

