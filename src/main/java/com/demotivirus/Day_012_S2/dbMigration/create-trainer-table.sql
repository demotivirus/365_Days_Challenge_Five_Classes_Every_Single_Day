DROP TABLE IF EXISTS trainer CASCADE;
DROP TABLE IF EXISTS trainer_info;
DROP TABLE IF EXISTS course;

create table trainer_info
(
    id    int NOT NULL PRIMARY KEY,
    power int         DEFAULT NULL,
    hobby varchar(64) DEFAULT NULL
);

create sequence trainer_info_id_seq;

alter table trainer_info alter column id set default nextval('public.trainer_info_id_seq');

alter sequence trainer_info_id_seq owned by trainer_info.id;



create table trainer
(
    id              smallserial NOT NULL PRIMARY KEY,
    first_name      varchar(64) DEFAULT NULL,
    last_name       varchar(64) DEFAULT NULL,
    email           varchar(64) DEFAULT NULL,
    trainer_info_id int REFERENCES trainer_info (id),
    UNIQUE (trainer_info_id)
);

create table course
(
    id         int NOT NULL PRIMARY KEY,
    title      varchar(128) DEFAULT NULL,
    trainer_id int REFERENCES trainer (id)
);

create sequence course_id_seq;

alter table course alter column id set default nextval('public.course_id_seq');

alter sequence course_id_seq owned by course.id;

