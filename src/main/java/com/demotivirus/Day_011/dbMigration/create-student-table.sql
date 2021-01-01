DROP TABLE IF EXISTS student;

create table student();

alter table student
    add id serial not null;

alter table student
    add first_name varchar(45);

alter table student
    add last_name varchar(45);

alter table student
    add email varchar(45);

alter table student
    add constraint student_pk
        primary key (id);