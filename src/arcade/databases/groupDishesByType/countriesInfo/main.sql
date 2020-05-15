/*Please add ; after each select statement*/
CREATE PROCEDURE countriesInfo()
BEGIN
    SELECT COUNT(*) as number, AVG(population) AS average, SUM(population) AS total FROM countries;
END