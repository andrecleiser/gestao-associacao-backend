package pt.org.hc.gestao.associados.dto.mapper;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import pt.org.hc.gestao.associados.dto.Associado.AssociadoDto;
import pt.org.hc.gestao.associados.dto.Associado.PerfilAssociadoDto;
import pt.org.hc.gestao.associados.entidade.Associado;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-16T12:38:24+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
@ApplicationScoped
public class AssociadoMapperImpl implements AssociadoMapper {

    @Override
    public Associado paraEntidade(AssociadoDto associadoDto) {
        if ( associadoDto == null ) {
            return null;
        }

        Associado associado = new Associado();

        associado.setNome( associadoDto.getNome() );
        associado.setNomeMae( associadoDto.getNomeMae() );
        associado.setNomePai( associadoDto.getNomePai() );
        associado.setDataNascimento( associadoDto.getDataNascimento() );
        associado.setMorada( associadoDto.getMorada() );
        associado.setConcelho( associadoDto.getConcelho() );
        associado.setDistrito( associadoDto.getDistrito() );
        associado.setDdi( associadoDto.getDdi() );
        associado.setTelemovel( associadoDto.getTelemovel() );
        associado.setCodigoPostal( associadoDto.getCodigoPostal() );
        associado.setEmail( associadoDto.getEmail() );
        associado.setNacionalidade( associadoDto.getNacionalidade() );

        return associado;
    }

    @Override
    public PerfilAssociadoDto paraPerfilDto(Associado associado) {
        if ( associado == null ) {
            return null;
        }

        PerfilAssociadoDto perfilAssociadoDto = new PerfilAssociadoDto();

        perfilAssociadoDto.setIdAssociado( associado.getIdAssociado() );
        perfilAssociadoDto.setNome( associado.getNome() );
        perfilAssociadoDto.setDataNascimento( associado.getDataNascimento() );
        perfilAssociadoDto.setNacionalidade( associado.getNacionalidade() );
        perfilAssociadoDto.setFoto( associado.getFoto() );

        return perfilAssociadoDto;
    }
}
