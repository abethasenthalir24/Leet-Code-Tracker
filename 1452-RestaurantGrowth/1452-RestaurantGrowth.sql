-- Last updated: 7/17/2026, 2:56:12 PM
# Write your MySQL query statement below
SELECT
    visited_on,
    amount,
    ROUND(amount / 7, 2) AS average_amount
FROM (
    SELECT
        visited_on,
        SUM(daily_amount) OVER (
            ORDER BY visited_on
            ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
        ) AS amount,
        COUNT(*) OVER (
            ORDER BY visited_on
            ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
        ) AS cnt
    FROM (
        SELECT
            visited_on,
            SUM(amount) AS daily_amount
        FROM Customer
        GROUP BY visited_on
    ) d
) t
WHERE cnt = 7;