DROP TABLE IF EXISTS reviewer CASCADE;
DROP TABLE IF EXISTS post_reviewer;

create table reviewer
(
    id       int NOT NULL PRIMARY KEY,
    nick     varchar(128) DEFAULT NULL,
    password varchar(128) DEFAULT NULL,
    email    varchar(128) DEFAULT NULL
);

create sequence reviewer_id_seq;
alter table reviewer
    alter column id set default nextval('public.reviewer_id_seq');
alter sequence reviewer_id_seq owned by reviewer.id;

create table post_reviewer(
    post_id int REFERENCES post (id) NOT NULL,
    reviewer_id int REFERENCES reviewer (id) NOT NULL,
    primary key (post_id, reviewer_id)
);