create sequence sq_tb_associado
start with 1
           increment by 1
           no minvalue
           no maxvalue
           cache 1;

create table tb_associado
(
    id_associado integer not null default nextval('sq_tb_associado'::regclass),
    nome varchar(70) NOT NULL,
    telemovel varchar(12) NOT NULL,
    email varchar(50) NOT NULL,
    nome_mae varchar(70) NOT NULL,
	nome_pai varchar(70),
	dt_nascimento date NOT NULL,
	morada varchar(150),
	concelho varchar(70),
	distrito varchar(70),
	cd_postal varchar(8),
	ddi varchar(3),
	nacionalidade varchar(20) NOT NULL,
	
    CONSTRAINT tb_associado_pkey PRIMARY KEY (id_associado)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

create unique index idx_tb_associado_unique_email on tb_associado (email);