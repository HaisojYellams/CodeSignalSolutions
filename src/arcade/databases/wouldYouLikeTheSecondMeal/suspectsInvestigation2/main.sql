/*Please add ; after each select statement*/
CREATE PROCEDURE suspectsInvestigation2()
BEGIN
    SELECT id, name, surname
    FROM suspect
    WHERE NOT
              (
                      height > 170 AND
                      name LIKE 'B%' AND
                      surname like 'gre_n'
                  )
    ORDER BY id;
END