/*Please add ; after each select statement*/
CREATE PROCEDURE newsSubscribers()
BEGIN
    SELECT DISTINCT subscriber
    FROM (
             SELECT subscriber, newspaper
             FROM full_year
             UNION
             SELECT subscriber, newspaper
             FROM half_year
         ) T1
    WHERE newspaper LIKE '%daily%'
    order by subscriber;
END