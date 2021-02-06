DROP TABLE IF EXISTS rus CASCADE;

CREATE TABLE rus
(
    id   bigserial   not null
        constraint rus_id primary key,
    word varchar(64) not null
);

DROP TABLE IF EXISTS eng CASCADE;

CREATE TABLE eng
(
    id   bigserial   not null
        constraint eng_id primary key,
    word varchar(64) not null
);

DROP TABLE IF EXISTS rus_eng CASCADE;

CREATE TABLE rus_eng
(
    rus_id bigint not null,
    eng_id bigint not null
);

DROP TABLE IF EXISTS eng_phrases;

CREATE TABLE eng_phrases(
    eng_id bigint not null,
    phrase varchar(512) not null
);

--- ADD FOREIGN KEYS ---

alter table rus_eng
    add constraint rus_eng_rus_id_fk
        foreign key (rus_id) references rus;

alter table rus_eng
    add constraint rus_eng_eng_id_fk foreign key (eng_id) references eng;

--------------------

alter table eng_phrases add constraint eng_phrases_eng_id_fk foreign key (eng_id) references eng;