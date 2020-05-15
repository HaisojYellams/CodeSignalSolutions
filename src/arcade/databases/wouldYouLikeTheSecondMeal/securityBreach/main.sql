/*Please add ; after each select statement*/
-- The problem statement is misleading - the first/second names ARE case sensitive, which is why BINARY is used.
CREATE PROCEDURE securityBreach()
BEGIN
    SELECT *
    FROM users
    WHERE attribute RLIKE BINARY CONCAT('^.+%', first_name, '_', second_name, '%.*$')
    order by attribute;
END