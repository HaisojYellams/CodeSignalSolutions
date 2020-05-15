/*Please add ; after each select statement*/
CREATE PROCEDURE expressionsVerification()
BEGIN
    SELECT *
    FROM expressions
    WHERE (operation = '+' AND a + b = c)
       OR (operation = '-' AND a - b = c)
       OR (operation = '*' AND a * b = c)
       OR (operation = '/' AND b != 0 AND a = b * c)
    ORDER BY id;
END