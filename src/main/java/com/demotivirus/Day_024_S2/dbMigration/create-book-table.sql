DROP TABLE IF EXISTS book CASCADE;

create table book
(
    id serial,
    title varchar(128) not null,
    author varchar(256) not null
);

create unique index book_id_uindex
    on book (id);

alter table book
    add constraint book_pk
        primary key (id);

