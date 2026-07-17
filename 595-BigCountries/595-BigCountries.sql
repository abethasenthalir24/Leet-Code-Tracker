-- Last updated: 7/17/2026, 2:57:12 PM
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;