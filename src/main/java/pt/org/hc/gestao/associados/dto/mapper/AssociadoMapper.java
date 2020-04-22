package pt.org.hc.gestao.associados.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import pt.org.hc.gestao.associados.dto.Associado.AssociadoDto;
import pt.org.hc.gestao.associados.dto.Associado.PerfilAssociadoDto;
import pt.org.hc.gestao.associados.entidade.Associado;

@Mapper(componentModel = "cdi")
public interface AssociadoMapper {

    @Mapping(expression = "java(associadoDto.getDataNascimento().toLocalDate())", target = "dataNascimento")
    Associado paraEntidade(AssociadoDto associadoDto);

    @Mappings({
        @Mapping(target = "idAssociado"),
        @Mapping(target = "nome"),
        @Mapping(target = "dataNascimento"),
        @Mapping(target = "nacionalidade"),
        @Mapping(target = "foto")
    })
    PerfilAssociadoDto paraPerfilDto(Associado associado);

    @Mapping(expression = "java(java.time.LocalDateTime.of(associado.getDataNascimento(), java.time.LocalTime.MIN))", target = "dataNascimento")
    AssociadoDto paraAssociadoDto(Associado associado);
}