--Função de criar a tabela toda vez que a aplicação for iniciada
create table produto ( -- cria a tabela
    id varchar(255) not null primary key, --define a coluna, não pode ser nulo e é uma primary key
    nome varchar(50) not null, --Define a coluna
    descricao varchar (300) , --Define a coluna
    valor numeric(18, 2) -- Define a coluna
);