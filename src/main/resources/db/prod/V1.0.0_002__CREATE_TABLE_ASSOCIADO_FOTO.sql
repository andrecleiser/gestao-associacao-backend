CREATE TABLE tb_associado_foto
(
	id_associado integer NOT NULL,
	foto_base64 text,
	
    PRIMARY KEY (id_associado),
	FOREIGN KEY (id_associado) REFERENCES tb_associado (id_associado)	
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;