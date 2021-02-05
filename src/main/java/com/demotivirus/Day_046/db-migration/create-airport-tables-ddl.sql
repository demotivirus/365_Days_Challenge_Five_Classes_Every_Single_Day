DROP TABLE IF EXISTS dictionary_airplane CASCADE;

create table dictionary_airplane
(
    id             bigserial not null
        constraint dictionary_airplane_pk
            primary key,
    airplane_model varchar   not null,
    company_id     bigint    not null,
    descr          varchar
);

DROP TABLE IF EXISTS dictionary_company CASCADE;

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
    code       varchar(45) not null,
    country_id bigint      not null
);

DROP TABLE IF EXISTS dictionary_country;

CREATE TABLE dictionary_country
(
    id         bigserial  not null
        constraint dictionary_contry_pk primary key,
    name       varchar    not null,
    code       varchar(5) not null,
    flag_image bytea
);

DROP TABLE IF EXISTS dictionary_airplane_classes CASCADE;

CREATE TABLE dictionary_airplane_classes
(
    id    bigserial not null
        constraint dictionary_airplane_classes_pk primary key,
    name  varchar   not null,
    descr varchar
);

DROP TABLE IF EXISTS flight CASCADE;

CREATE TABLE flight
(
    id              bigserial not null
        constraint flight_pk primary key,
    code            varchar   not null unique,
    flight_date     timestamp,
    flight_duration bigint    not null,
    airplane_id     bigint    not null,
    city_from_id    bigint    not null,
    city_to_id      bigint    not null
);

DROP TABLE IF EXISTS passenger CASCADE;

CREATE TABLE passenger
(
    id              bigserial   not null
        constraint passenger_pk primary key,
    firstname       varchar     not null,
    middle_name     varchar,
    lastname        varchar     not null,
    passport_number varchar(32) not null,
    email           varchar     not null,
    phone           varchar(32) not null
);

DROP TABLE IF EXISTS reservation CASCADE;

CREATE TABLE reservation
(
    id                  bigserial not null
        constraint reservation_pk primary key,
    flight_id bigint    not null,
    dictionary_place_id bigint    not null,
    client_comment      varchar,
    passenger_id        bigint    not null,
    reserve_datetime    timestamp,
    code                varchar   not null unique
);

DROP TABLE IF EXISTS dictionary_place CASCADE;

CREATE TABLE dictionary_place
(
    id                             bigserial not null
        constraint dictionary_place_pk primary key,
    line                           char(1)   not null,
    seat                           int       not null,
    dictionary_airplane_classes_id bigint    not null
);

DROP TABLE IF EXISTS dictionary_airplane_places;

CREATE TABLE dictionary_airplane_places
(
    id          bigserial not null
        constraint dictionary_airplane_places_pk primary key,
    airplane_id bigint    not null,
    place_id    bigint    not null
);

-- ADD FOREIGN KEYS --

alter table dictionary_airplane
    add constraint dictionary_airplane_dictionary_company_id_fk
        foreign key (company_id) references dictionary_company;

alter table flight
    add constraint flight_dictionary_city_id_fk
        foreign key (city_to_id) references dictionary_city;

alter table flight
    add constraint flight_dictionary_city_id_fk_2
        foreign key (city_from_id) references dictionary_city;

alter table flight
    add constraint flight_dictionary_airplane_id_fk
        foreign key (airplane_id) references dictionary_airplane;

alter table reservation
    add constraint reservation_flight_id_fk
        foreign key (flight_id) references flight;

alter table reservation
    add constraint reservation_passenger_id_fk
        foreign key (passenger_id) references passenger;

alter table reservation
    add constraint reservation_dictionary_place_id_fk
        foreign key (dictionary_place_id) references dictionary_place;

alter table dictionary_place
    add constraint dictionary_place_dictionary_airplane_classes_id_fk
        foreign key (dictionary_airplane_classes_id) references dictionary_airplane_classes;

alter table dictionary_city
    add constraint dictionary_city_dictionary_country_id_fk
        foreign key (country_id) references dictionary_country;

alter table dictionary_airplane_places
    add constraint dictionary_airplane_places_airplane_id_fk
        foreign key (airplane_id) references dictionary_airplane;

alter table dictionary_airplane_places
    add constraint dictionary_airplane_places_places_id_fk
        foreign key (place_id) references dictionary_place;