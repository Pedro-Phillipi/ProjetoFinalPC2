CREATE TABLE IF NOT EXIST Cliente 
(
    codcliente Serial PRIMARY KEY,
    nomeCliente character varying NOT NULL,  
    rgCliente INTEGER NOT NULL,
    enderecoCliente character varying COLLATE pg_catalog."default" NOT NULL,
    bairroCliente character varying COLLATE pg_catalog."default" NOT NULL,
    cidadeCliente character varying COLLATE pg_catalog."default" NOT NULL,
    estadoCliente character varying COLLATE pg_catalog."default" NOT NULL,
    cepCliente INTEGER NOT NULL,
    nascimentoCliente DATE NOT NULL
);


CREATE TABLE IF NOT EXISTS chale
(
    codchale SERIAL PRIMARY KEY,
    localizacao character varying COLLATE pg_catalog."default" NOT NULL,
    capacidade integer NOT NULL,
    valorAltaEstacao decimal (10,2) NOT NULL,
    valorBaixaEstacao decimal (10,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS hospedagem
(
    codHospedagem SERIAL PRIMARY KEY,
	codChale SERIAL,
	codCliente SERIAL,
	estado character varying COLLATE pg_catalog."default" NOT NULL,
    	dataInicio date NOT NULL,
    	dataFim date ,
    	qtdPessoas integer NOT NULL,
    	desconto decimal(10,2) NOT NULL,
    	valorFinal decimal(10,2) NOT NULL,
    	FOREIGN KEY(codChale) REFERENCES chale(codChale),
	FOREIGN KEY(codCliente) REFERENCES cliente(codCliente)
);
