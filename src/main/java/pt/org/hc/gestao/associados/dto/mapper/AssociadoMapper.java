package pt.org.hc.gestao.associados.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import pt.org.hc.gestao.associados.dto.AssociadoDto;
import pt.org.hc.gestao.associados.entidade.Associado;

@Mapper(componentModel = "cdi")
public interface AssociadoMapper {

    Associado paraEntidade(AssociadoDto associadoDto);
}