drop TABLE associado_foto;

CREATE TABLE associado_foto
(
    id_associado_foto serial NOT NULL,
	id_associado integer NOT NULL,
	foto_base64 text,
	
    PRIMARY KEY (id_associado_foto),
	FOREIGN KEY (id_associado) REFERENCES associado (id_associado)	
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.associado_foto
    OWNER to postgres;
	
create unique index idx_unique_id_associado on associado_foto (id_associado);