SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS students;

CREATE TABLE students (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  score char(80) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO name (name)
VALUES
( 'id'), ('name'), ('score');



INSERT INTO id (id, name)
VALUES
(1, 'Ana'),
(2, 'Harry'),
(5, 'Kas');

INSERT INTO score (title)
VALUES
("100"), ("50");

INSERT INTO INSERT INTO `lesson4`.`students` (`id`, `name`, `score`)
VALUES
(1, 'Ana', '100');
(2, 'Harry', '50');
(3, 'Ron', '76');
(4, 'Tom', '60');
(5, 'Kas', '58');
(6, 'Den', '44');
(7, 'Sam', '38');
(8, 'Frodo', '29');
(9, 'Grisha', '22');
(10, 'Tima', '19');
(11, 'Katya', '18');
(12, 'Kolya', '15');
(13, 'Sachar', '10');
(14, 'Michael', '9');
(15, 'Anton', '6');
(16, 'Ars', '8');
(17, 'Artem', '70');
(18, 'Mark', '90');
(19, 'Fiona', '98');
(20, 'Lasly', '54');