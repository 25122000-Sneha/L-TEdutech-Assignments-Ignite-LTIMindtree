create database q4;
use q4;

CREATE TABLE user(
	id INT PRIMARY KEY,
    name VARCHAR(100),
    contact_detail VARCHAR(100),
    username VARCHAR(100),
    password VARCHAR(100)
);

INSERT INTO user VALUES(1, 'John', '9876543210', 'johny', '12345');
INSERT INTO user VALUES(2, 'Peter', '9873216540', 'peterey', 'pet123');
INSERT INTO user VALUES(3, 'Adam', '9871236504', 'adamanta', 'ad@123');
INSERT INTO user VALUES(4, 'Linda', '8794561320', 'lindahere', 'abcd');
INSERT INTO user VALUES(5, 'Tony', '7894561230', 'tonii', 'abc123');

select * from user;



CREATE TABLE Hall(
	id INT PRIMARY KEY auto_increment,
    name VARCHAR(100),
    contact_detail VARCHAR(100),
    cost_per_day DOUBLE,
    owner_id INT,
    CONSTRAINT ck_fk FOREIGN KEY(owner_id) REFERENCES user(id)
);

INSERT INTO Hall(name, contact_detail, cost_per_day, owner_id) VALUES('Party hall', '9874653201', 5000, 1);
INSERT INTO Hall(name, contact_detail, cost_per_day, owner_id) VALUES('Dining Hall', '9876541230', 3000, 2);
INSERT INTO Hall(name, contact_detail, cost_per_day, owner_id) VALUES('Disco Hall', '9871234560', 8000, 3);
INSERT INTO Hall(name, contact_detail, cost_per_day, owner_id) VALUES('Conference Hall', '7891236540', 7500, 4);
INSERT INTO Hall(name, contact_detail, cost_per_day, owner_id) VALUES('Meeting Hall', '8974102365', 9000, 5);

drop table Hall;

select * from Hall;
SELECT h.id, h.name, h.contact_detail, h.cost_per_day, u.name FROM Hall h INNER JOIN user u ON h.owner_id = u.id;

select * from user WHERE name LIKE 'Jerry';