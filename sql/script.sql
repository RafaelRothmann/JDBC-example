create table Departament (
	id int Primary Key,
    nome varchar(50),
    pessoas int check (pessoas > 0)
);

insert into Departament (id,nome,pessoas) value (1,"RH", 5);
insert into Departament (id,nome,pessoas) value (2,"DESING", 15);
insert into Departament (id,nome,pessoas) value (3,"DESENVOLVEDOR", 30);
insert into Departament (id,nome,pessoas) value (4,"GERENCIA", 3);