create database testdb ENCODING = 'UTF8';

\c testdb;

CREATE TABLE employee (
  id bigint,
  name varchar(50),
  job varchar(20)
);

INSERT INTO employee (id, name, job) VALUES (1, '田中太郎', 'エンジニア');
INSERT INTO employee (id, name, job) VALUES (2, '鈴木花子', 'デザイナー');
INSERT INTO employee (id, name, job) VALUES (3, '山下哲也', '営業');