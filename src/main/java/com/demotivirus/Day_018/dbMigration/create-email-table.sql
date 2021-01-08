DROP TABLE IF EXISTS email;

create table email
(
    id      serial        not null
        constraint email_pk
            primary key,
    message varchar(1000) not null
);