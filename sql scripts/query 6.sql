DELIMITER //
CREATE FUNCTION display_user(userName VARCHAR(30))
RETURNS VARCHAR(30)
DETERMINISTIC
BEGIN
	DECLARE pass VARCHAR(30);
	SELECT password INTO pass FROM user WHERE name LIKE userName;
    RETURN pass;
END //
DELIMITER ;

SELECT display_user('Antony');
select * from book;
use aliens;
DELIMITER //
CREATE PROCEDURE display_password1(IN userName VARCHAR(30))
BEGIN
	SELECT password FROM user
    WHERE name LIKE userName;
END //
DELIMITER ;

CALL display_password1('Antony');


DELIMITER //
CREATE PROCEDURE display_username(IN name VARCHAR(30), OUT username VARCHAR(30))
BEGIN
	SELECT u.username INTO username
    FROM user u
    WHERE u.name LIKE name;
END //
DELIMITER ;

drop procedure display_username;
CALL display_username('Antony', @U);
SELECT @U;

select * from user;

SELECT CONCAT(username, ' has password ', password)
FROM user;