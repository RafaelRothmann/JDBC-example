create database coursejdbc;

use coursejdbc;

create table Departament (
	id int Primary Key,
    nome varchar(50) NOT NULL
);

create table Employee (
    id int Primary Key,
    nome varchar(50) NOT NULL,
    salario float,
    id_departamento int,
    FOREIGN key (id_departamento) references Departament(id),
    Check (salario > 0 and salario is NOT NULL)
);

insert into Departament (id,nome) value (1,"RH");
insert into Departament (id,nome) value (2,"DESING");
insert into Departament (id,nome) value (3,"DESENVOLVEDOR");
insert into Departament (id,nome) value (4,"GERENCIA");

insert into Employee (id,nome,salario,id_departamento) value (1,"Daniel",1000,1);
insert into Employee (id,nome,salario,id_departamento) value (2,"Bob",1500,2);
insert into Employee (id,nome,salario,id_departamento) value (3,"Maria",3000,3);
insert into Employee (id,nome,salario,id_departamento) value (4,"Rafael",10000,4);
insert into Employee (id,nome,salario,id_departamento) value (5,"Nicolas",50000,3);