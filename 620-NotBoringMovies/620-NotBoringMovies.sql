-- Last updated: 7/22/2026, 7:23:31 PM

SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description <> 'boring'
ORDER BY rating DESC;