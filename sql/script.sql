create database coursejdbc;

use coursejdbc;

create table Departament (
	id int Primary Key,
    nome varchar(50) NOT NULL
);

create table Employee (
    id int Primary Key,
    nome varchar(50) NOT NULL,
    id_departamento int,
    FOREIGN key (id_departamento) references Departament(id)
);

insert into Departament (id,nome) value (1,"RH");
insert into Departament (id,nome) value (2,"DESING");
insert into Departament (id,nome) value (3,"DESENVOLVEDOR");
insert into Departament (id,nome) value (4,"GERENCIA");