/*Please add ; after each select statement*/
CREATE PROCEDURE mischievousNephews()
BEGIN
    SELECT WEEKDAY(mischief_date) as 'weekday', mischief_date, author, title
    FROM mischief
    order by weekday, FIELD(author, 'Huey', 'Dewey', 'Louie'), mischief_date, title;
END