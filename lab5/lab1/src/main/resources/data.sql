INSERT INTO users (email, firstname, lastname, password)
VALUES ('uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (email, firstname, lastname, password)
VALUES ('john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (email, firstname, lastname, password)
VALUES ('dean@miu.edu', 'Dean', 'Altarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO role (role)
VALUES ('ADMIN');
INSERT INTO role (role)
VALUES ('CLIENT');


INSERT INTO users_roles (user_id, roles_id)
VALUES (1, 1);
INSERT INTO users_roles (user_id, roles_id)
VALUES (2, 1);
INSERT INTO users_roles (user_id, roles_id)
VALUES (3, 2);

--drop table users;


/*-- users

INSERT INTO users(name)
VALUES ('user1');

INSERT INTO users(name)
VALUES ('user2');

INSERT INTO users(name)
VALUES ('user3');

INSERT INTO users(name)
VALUES ('user4');

INSERT INTO users(name)
VALUES ('user5');


---select users ---
Select * from users;

-- Post---

--post_id
INSERT INTO post(user_id,author,content,title)
VALUES (1,'author1','content1','title1');

INSERT INTO post(user_id,author,content,title)
VALUES (1,'author2','content2','title2');

INSERT INTO post(user_id,author,content,title)
VALUES (3,'author3','content3','title3');

INSERT INTO post(user_id,author,content,title)
VALUES (2,'author3','content3','title3');

INSERT INTO post(user_id,author,content,title)
VALUES (2,'author3','content3','title3');

---select post
select * from post;

---Comment---
INSERT INTO Comment(post_id,name)
VALUES (1,'Comment1');

INSERT INTO Comment(post_id,name)
VALUES (2,'Comment2');

INSERT INTO Comment(post_id,name)
VALUES (3,'Comment3');

INSERT INTO Comment(post_id,name)
VALUES (3,'Comment3');

INSERT INTO Comment(post_id,name)
VALUES (4,'Comment111');

INSERT INTO Comment(post_id,name)
VALUES (5,'Comment112');

--select comment ---
Select * from comment;
*/