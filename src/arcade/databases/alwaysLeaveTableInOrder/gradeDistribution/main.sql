/*Please add ; after each select statement*/
CREATE PROCEDURE gradeDistribution()
BEGIN
    SELECT Name, ID
    FROM grades
    WHERE 2 * final > midterm1 + midterm2
    ORDER BY SUBSTRING(name, 1, 3), ID;
END