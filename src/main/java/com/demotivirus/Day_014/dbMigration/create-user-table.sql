DROP TABLE IF EXISTS users CASCADE;

create table users
(
    id       int      not null
        primary key,
    login    varchar(64) not null,
    password varchar(32) not null,
    email    varchar(64) not null
);

create sequence users_id_seq;
alter table users
    alter column id set default nextval('public.users_id_seq');
alter sequence users_id_seq owned by users.id;