CREATE DATABASE poo2_tc3_grades;
USE poo2_tc3_grades;

CREATE TABLE students (
	id INT UNSIGNED AUTO_INCREMENT,
    document CHAR(10) NOT NULL,
    `name` VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    grade_1 DOUBLE(4,2) NOT NULL,
    grade_2 DOUBLE(4,2) NOT NULL,
    grade_3 DOUBLE(4,2) NOT NULL,
    PRIMARY KEY (id)
)