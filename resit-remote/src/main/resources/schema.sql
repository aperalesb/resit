drop table if exists USERS;
drop table if exists PROFILE;
drop table if exists COMPANY;

create table USERS (ID_CON bigint auto_increment, 
NAME varchar(255), SURNAME varchar(255), IDENTIFICATION varchar(255), SEX varchar(255), 
AGE int, primary key (ID_CON));

create table PROFILE (ID_PRO smallint auto_increment, 
NAME SET("consumidor","vendedor","inspector","administrador"), primary key (ID_PRO));

create table COMPANY (ID_COM bigint auto_increment, 
IDENTIFICATION varchar(255), NAME varchar(255), ADDRESS varchar(255), PHONE numeric(9), 
RETURN_PERIOD date, primary key (ID_COM));