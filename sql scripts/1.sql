create database Items;
use Items;

CREATE TABLE user(
	id INT primary key auto_increment,
    name VARCHAR(100),
    contact_detail VARCHAR(100),
    username VARCHAR(100),
    password VARCHAR(100)
);
use aliens;
drop table user;
INSERT INTO user(name, contact_detail, username, password) VALUES('John', '9876543210', 'johny', '12345');
INSERT INTO user(name, contact_detail, username, password) VALUES('Peter', '9873216540', 'peterey', 'pet123');
INSERT INTO user(name, contact_detail, username, password) VALUES('Adam', '9871236504', 'adamanta', 'ad@123');
INSERT INTO user(name, contact_detail, username, password) VALUES('Linda', '8794561320', 'lindahere', 'abcd');
INSERT INTO user(name, contact_detail, username, password) VALUES('Tony', '7894561230', 'tonii', 'abc123');
delete from user WHERE id = 6;
select * from user;
delete from User where name Like 'Antony';
use aliens;
show full tables;
DESC office;
show columns from office;

create table BOOK(
	id INT,
    name VARCHAR(100),
    author VARCHAR(100)
);
INSERT INTO BOOK VALUES(1, 'Alchemist', 'Anne Frank');
INSERT INTO BOOK VALUES(2, 'Pickwick Papers', 'Charles Dickens');