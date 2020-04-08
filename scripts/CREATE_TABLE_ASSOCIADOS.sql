drop TABLE associado;

CREATE TABLE associado
(
    id_associado serial NOT NULL,
    nome varchar(70) NOT NULL,
    telemovel varchar(12) NOT NULL,
    email varchar(50) NOT NULL,
    nome_mae varchar(70) NOT NULL,
	nome_pai varchar(70),
	dt_nascimento date NOT NULL,
	morada varchar(150) NOT NULL,
	concelho varchar(70) NOT NULL,
	distrito varchar(70) NOT NULL,
	cd_postal varchar(7) NOT NULL,
	ddi varchar(3),
	nacionalidade varchar(20) NOT NULL,
	foto_base64 text,
	
    CONSTRAINT associado_pkey PRIMARY KEY (id_associado)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.associado
    OWNER to postgres;
	
create unique index idx_unique_email on associado (email);