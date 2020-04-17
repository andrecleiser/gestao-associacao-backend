package pt.org.hc.gestao.associados.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import pt.org.hc.gestao.associados.dto.Associado.AssociadoDto;
import pt.org.hc.gestao.associados.dto.Associado.PerfilAssociadoDto;
import pt.org.hc.gestao.associados.entidade.Associado;

@Mapper(componentModel = "cdi")
public interface AssociadoMapper {

    Associado paraEntidade(AssociadoDto associadoDto);

    @Mappings({
        @Mapping(target = "idAssociado"),
        @Mapping(target = "nome"),
        @Mapping(target = "dataNascimento", dateFormat = "dd/MM/yyyy"),
        @Mapping(target = "nacionalidade"),
        @Mapping(target = "foto")
    })
    PerfilAssociadoDto paraPerfilDto(Associado associado);
}