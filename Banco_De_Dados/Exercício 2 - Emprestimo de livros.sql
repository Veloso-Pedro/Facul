create database emprestimo_de_livros;

create table livro (
	isbn char(13) unique not null primary key,
    titulo varchar(150) not null,
    autor varchar(150) not null
);

create table leitor (
	cpf char(11) unique not null primary key,
    nome varchar(120) not null,
    email varchar(150) unique
);

create table empresatimo (
	cpf char(11),
    isbn char(13),
    data_retirada date not null,
    data_prevista date not null,
    primary key (cpf, isbn, data_retirada),
    foreign key (cpf) references leitor (cpf)
		on delete restrict,
	foreign key (isbn) references livro (isbn)
		on delete restrict
);