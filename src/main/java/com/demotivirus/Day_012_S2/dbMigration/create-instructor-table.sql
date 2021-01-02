DROP TABLE IF EXISTS instructor;
DROP TABLE IF EXISTS instructor_detail;

create table instructor_detail
(
    id              smallserial NOT NULL PRIMARY KEY,
    youtube_channel varchar(128) DEFAULT NULL,
    hobby           varchar(64)  DEFAULT NULL
);

create table instructor
(
    id                   smallserial NOT NULL PRIMARY KEY,
    first_name           varchar(64) DEFAULT NULL,
    last_name            varchar(64) DEFAULT NULL,
    email                varchar(64) DEFAULT NULL,
    instructor_detail_id int REFERENCES instructor_detail (id),
    UNIQUE (instructor_detail_id)
);