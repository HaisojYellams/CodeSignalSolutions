/*Please add ; after each select statement*/
CREATE PROCEDURE nullIntern()
BEGIN
    SELECT COUNT(*) as number_of_nulls
    FROM departments
    WHERE description is NULL
       OR TRIM(description) RLIKE '^(null|nil|-)$';
END