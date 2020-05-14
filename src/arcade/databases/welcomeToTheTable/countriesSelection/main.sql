/*Please add ; after each select statement*/
CREATE PROCEDURE countriesSelection()
BEGIN
    SELECT * FROM COUNTRIES WHERE continent = "Africa" ORDER BY name;
END