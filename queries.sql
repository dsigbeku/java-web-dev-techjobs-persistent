## Part 1: Test it with SQL
Int Id VARCHAR employer VARCHAR name VARCHAR skill

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St Louis City";

## Part 3: Test it with SQL
Drop TABLE job

## Part 4: Test it with SQL
SELECT name, descriptions
FROM skill
INNER JOIN skill ON job_skill
ORDER BY name ASC;
