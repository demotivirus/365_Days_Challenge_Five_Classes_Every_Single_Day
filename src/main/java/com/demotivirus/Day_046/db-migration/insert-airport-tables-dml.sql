insert into dictionary_company (name, descr) values ('Airport', 'Russian company');
insert into dictionary_company (name, descr) values ('TrumpAeroflot', 'American flight corp');

insert into dictionary_airplane (airplane_model, company_id) values ('Boeing-747', 1);
insert into dictionary_airplane (airplane_model, company_id) values ('Tu-154', 1);
insert into dictionary_airplane (airplane_model, company_id) values ('Boeing-678', 2);
insert into dictionary_airplane (airplane_model, company_id) values ('Boeing-884', 2);

insert into public.dictionary_airplane_classes (name) values ('Simple');
insert into public.dictionary_airplane_classes (name) values ('Middle');
insert into public.dictionary_airplane_classes (name) values ('Business');

insert into public.dictionary_country (name, code) values ('Russia', 'RUS');
insert into public.dictionary_country (name, code) values ('China', 'CHN');
insert into public.dictionary_country (name, code) values ('America', 'USA');

insert into public.dictionary_city (name, code, country_id) values ('Moscow', 'MSK', 1);
insert into public.dictionary_city (name, code, country_id) values ('Pekin', 'PKN', 2);
insert into public.dictionary_city (name, code, country_id) values ('Washington', 'WTN', 3);

insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('A', 1, 1);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('A', 2, 1);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('A', 3, 1);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('A', 4, 1);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('B', 1, 2);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('B', 2, 2);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('B', 3, 2);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('B', 4, 2);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('C', 1, 3);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('C', 2, 3);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('C', 3, 3);
insert into public.dictionary_place (line, seat, dictionary_airplane_classes_id) values ('C', 4, 3);

insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 1);
insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 2);
insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 3);
insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 4);
insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 5);
insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 6);
insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 7);
insert into public.dictionary_airplane_places (airplane_id, place_id) values (1, 9);

insert into public.flight (code, flight_date, flight_duration, airplane_id, city_from_id, city_to_id) values ('sdofj23', '2021-02-05 21:23:41.000000', 220, 1, 1, 2);
insert into public.flight (code, flight_date, flight_duration, airplane_id, city_from_id, city_to_id) values ('s678g', '2021-02-05 21:24:41.000000', 330, 2, 1, 3);