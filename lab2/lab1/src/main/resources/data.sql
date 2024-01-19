-- users

INSERT INTO users(name)
VALUES ('user1');

INSERT INTO users(name)
VALUES ('user2');

INSERT INTO users(name)
VALUES ('user3');


---select product ---
Select * from users;

-- Post
INSERT INTO post(user_id,author,content,title)
VALUES (1,'author1','content1','title1');

INSERT INTO post(user_id,author,content,title)
VALUES (1,'author2','content2','title2');

INSERT INTO post(user_id,author,content,title)
VALUES (3,'author3','content3','title3');
---select post
select * from post;



