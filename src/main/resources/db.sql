CREATE TABLE grade
(
  name CHARACTER VARYING(30) NOT NULL,
  division CHARACTER VARYING(30) NOT NULL,
  CONSTRAINT idname PRIMARY KEY (name)
);

insert into public.grade (name, division) values ('six', 'a');
insert into public.grade (name, division) values ('seven', 'b');


CREATE TABLE student
(
  name VARCHAR(30) NOT NULL,
  id VARCHAR(30) PRIMARY KEY NOT NULL,
  grade VARCHAR(30) NOT NULL

);

ALTER TABLE
student ADD CONSTRAINT grade FOREIGN KEY (grade) REFERENCES grade (name)
ON DELETE CASCADE
ON UPDATE CASCADE;



insert into public.student (id, name, grade) values (1, 'aa', 'six');
insert into public.student (id, name, grade) values (2, 'cc', 'seven');
insert into public.student (id, name, grade) values (3, 'dd', 'seven');
insert into public.student (id, name, grade) values (4, 'bb', 'seven');
