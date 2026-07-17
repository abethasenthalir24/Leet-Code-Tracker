-- Last updated: 7/17/2026, 2:56:04 PM
# Write your MySQL query statement below
SELECT
    stock_name,
    SUM(
        CASE
            WHEN operation = 'Sell' THEN price
            ELSE -price
        END
    ) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;