-- Create a table called students with id,name,age and grade columns. Make id the primary key.Insert five records into the students table with the following information:
-- write a query to select all students named 'John Doe' to 'A+'.
-- Delete the record of a student whose id is 3.

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    grade VARCHAR(2)
);

INSERT INTO students (id, name, age, grade) VALUES (1, 'John Doe', 20, 'A');
INSERT INTO students (id, name, age, grade) VALUES (2, 'John Doe', 21, 'A-');
INSERT INTO students (id, name, age, grade) VALUES (3, 'John Doe', 22, 'B');
INSERT INTO students (id, name, age, grade) VALUES (4, 'John Doe', 23, 'B+');
INSERT INTO students (id, name, age, grade) VALUES (5, 'John Doe', 24, 'A+');

SELECT * FROM students WHERE name = 'John Doe' AND grade = 'A+';

DELETE FROM students WHERE id = 3;
