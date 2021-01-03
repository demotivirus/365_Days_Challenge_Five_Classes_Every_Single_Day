DROP TABLE IF EXISTS post CASCADE ;
DROP TABLE IF EXISTS review;

create table post
(
    id    int NOT NULL PRIMARY KEY,
    title varchar(128)   DEFAULT NULL,
    text  varchar(50000) DEFAULT NULL
);

create sequence post_id_seq;
alter table post alter column id set default nextval('public.post_id_seq');
alter sequence post_id_seq owned by post.id;



create table review
(
    id      int NOT NULL PRIMARY KEY,
    comment varchar(128) DEFAULT NULL,
    post_id int REFERENCES post (id)
);

create sequence review_id_seq;
alter table review alter column id set default nextval('public.review_id_seq');
alter sequence review_id_seq owned by review.id;

