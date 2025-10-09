create database Reservas_de_Sala

default character set utf8mb4
collate utf8mb4_general_ci;

create table sala (
	cod_sala varchar(10) unique not null primary key,
    nome varchar(80) not null,
    capacidade int not null default 0,
    ativa tinyint(1) not null
);

create table colaborador (
	email varchar(120) unique not null primary key,
    nome varchar(120) not null
);

create table reserva (
	id_reserva varchar(120) unique not null primary key,
    dataHoraInicio datetime not null,
    dataHoraFim datetime not null,
    email_responsavel varchar(120),
    cod_sala varchar(120),
    
    foreign key (email_responsavel) references colaborador(email)
		on delete set null,
	foreign key (cod_sala) references sala(cod_sala)
		on delete restrict 
);
