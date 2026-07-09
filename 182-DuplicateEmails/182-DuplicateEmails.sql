-- Last updated: 7/9/2026, 10:06:23 AM
SELECT
    email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
