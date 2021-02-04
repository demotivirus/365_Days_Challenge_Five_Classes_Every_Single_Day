DROP TABLE IF EXISTS dictionary_airplane CASCADE;

create table dictionary_airplane
(
    id              bigserial not null
        constraint dictionary_airplane_pk
            primary key,
    airplane_model  varchar   not null,
    number_of_seats int       not null,
    company_id      varchar   not null
);

DROP TABLE IF EXISTS dictionary_company;

CREATE TABLE dictionary_company
(
    id    bigserial not null
        constraint dictionary_company_pk primary key,
    name  varchar   not null,
    descr varchar
);

DROP TABLE IF EXISTS dictionary_city CASCADE;

CREATE TABLE dictionary_city
(
    id         bigserial   not null
        constraint dictionary_city_pk primary key,
    name       varchar     not null,
    postcode   varchar(45) not null,
    country_id varchar(45) not null
);

DROP TABLE IF EXISTS dictionary_country;

CREATE TABLE dictionary_country
(
    id         bigserial  not null
        constraint dictionary_contry_pk primary key,
    name       varchar    not null,
    short_name varchar(5) not null,
    flag_image bytea
);

DROP TABLE IF EXISTS dictionary_airplane_classes;

CREATE TABLE dictionary_airplane_classes
(
    id    bigserial not null
        constraint dictionary_airplane_classes_pk primary key,
    name  varchar   not null,
    descr varchar
);

DROP TABLE IF EXISTS flight_timetable CASCADE;

CREATE TABLE flight_timetable
(
    id              bigserial not null
        constraint flight_timetable_pk primary key,
    flight_number   varchar   not null unique,
    flight_date     bigint    not null,
    flight_time     bigint    not null,
    airplane_id     bigint    not null,
    flight_duration bigint    not null,
    city_from_id    bigint    not null,
    city_to_id      bigint    not null
);

alter table flight_timetable
    add constraint flight_timetable_dictionary_city_id_fk
        foreign key (city_to_id) references dictionary_city;

alter table flight_timetable
    add constraint flight_timetable_dictionary_city_id_fk_2
        foreign key (city_from_id) references dictionary_city;

alter table flight_timetable
    add constraint flight_timetable_dictionary_airplane_id_fk
        foreign key (airplane_id) references dictionary_airplane;

DROP TABLE IF EXISTS passenger;

CREATE TABLE passenger
(
    id              bigserial    not null
        constraint passenger_pk primary key,
    firstname       varchar      not null,
    middle_name     varchar,
    lastname        varchar      not null,
    passport_number varchar(100) not null,
    email           varchar      not null,
    phone           varchar(20)  not null
);

DROP TABLE IF EXISTS reservation;

CREATE TABLE reservation
(
    id                  bigserial not null
        constraint reservation_pk primary key,
    flight_timetable_id bigint    not null,
    line                char(1)   not null,
    seats               int       not null,
    passenger_id        bigint    not null
);

alter table reservation
    add constraint reservation_flight_timetable_id_fk
        foreign key (flight_timetable_id) references flight_timetable;

alter table reservation
    add constraint passenger_id_fk
        foreign key (passenger_id) references passenger;