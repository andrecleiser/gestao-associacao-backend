alter table associado
  alter column telemovel drop not null;
  
alter table associado
  alter column morada drop not null;
  
alter table associado
  alter column concelho drop not null;
  
alter table associado
  alter column distrito drop not null;

alter table associado
  drop column cd_postal;

alter table associado
  add column cd_postal varchar(08);

alter table associado
  drop column morada;

alter table associado
  add column morada varchar(100);
