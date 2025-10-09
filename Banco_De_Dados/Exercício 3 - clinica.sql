create database clinica;

create table paciente (
	cpf char(20) unique not null primary key,
    nome varchar(120) not null
);

create table medico (
	crm varchar(15) not null,
    uf char(2),
    nome varchar(120) not null,
    primary key (crm, uf)
);

create table consulta (
	cpf_paciente char(11),
    crm varchar(15),
    uf char(2),
    data_hora datetime not null,
    motivo varchar(200) not null,
    criada_em datetime default current_timestamp not null,
    primary key (cpf_paciente, crm, uf, data_hora),
	foreign key (cpf_paciente) references paciente (cpf)
		on delete restrict,
	foreign key (crm, uf) references medico (cmr, uf)
		on delete restrict
);