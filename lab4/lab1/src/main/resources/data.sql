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