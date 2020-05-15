/*Please add ; after each select statement*/
CREATE PROCEDURE marketReport()
BEGIN
    SELECT *
    FROM (SELECT country,
                 COUNT(*) as competitors
          FROM foreignCompetitors
          GROUP BY country
          ORDER BY country
         ) T1
    UNION
    SELECT 'Total:' as country, COUNT(*)
    FROM foreignCompetitors;
END