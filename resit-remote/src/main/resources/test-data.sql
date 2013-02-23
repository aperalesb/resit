-- Usuarios
insert into USERS (ID_CON, NAME, SURNAME, IDENTIFICATION, SEX, AGE) 
values (null, 'Alberto', 'Perales', '31711815J', 'male', '29');

insert into USERS (ID_CON, NAME, SURNAME, IDENTIFICATION, SEX, AGE) 
values (null, 'Amin', 'Abu-Taleb', '31711815J', 'male', '29');

insert into USERS (ID_CON, NAME, SURNAME, IDENTIFICATION, SEX, AGE)
values (null, 'Marina', 'Cabello', '31711815J', 'male', '29');

insert into USERS (ID_CON, NAME, SURNAME, IDENTIFICATION, SEX, AGE)
values (null, 'Araceli', 'Achaerandio', '31711815J', 'male', '29');

-- Perfiles
insert into PROFILE (ID_PRO, NAME)
values (null, 'consumidor');

insert into PROFILE (ID_PRO, NAME)
values (null, 'vendedor');

insert into PROFILE (ID_PRO, NAME)
values (null, 'inspector');

insert into PROFILE (ID_PRO, NAME)
values (null, 'administrador');

-- Empresas
insert into COMPANY (ID_COM, IDENTIFICATION, NAME, ADDRESS, PHONE, RETURN_PERIOD)
values (null, '2856432X', 'El Corte Inglés', 'C/Murillo 22, Jerez de la Frontera (Cádiz)', '959556677', '2008-12-13'); -- YYYY-MM-DD

insert into COMPANY (ID_COM, IDENTIFICATION, NAME, ADDRESS, PHONE, RETURN_PERIOD)
values (null, '0934312F', 'Mediamark', 'Avenida Kansas City, Sevilla (Sevilla)', '954234568', '2014-04-01'); -- YYYY-MM-DD