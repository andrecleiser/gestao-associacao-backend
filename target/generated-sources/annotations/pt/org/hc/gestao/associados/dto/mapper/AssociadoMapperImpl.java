package pt.org.hc.gestao.associados.dto.mapper;

import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;
import pt.org.hc.gestao.associados.dto.Associado.AssociadoDto;
import pt.org.hc.gestao.associados.dto.Associado.PerfilAssociadoDto;
import pt.org.hc.gestao.associados.entidade.Associado;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-15T07:35:45+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (AdoptOpenJDK)"
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
        associado.setMorada( associadoDto.getMorada() );
        associado.setConcelho( associadoDto.getConcelho() );
        associado.setDistrito( associadoDto.getDistrito() );
        associado.setDdi( associadoDto.getDdi() );
        associado.setTelemovel( associadoDto.getTelemovel() );
        associado.setCodigoPostal( associadoDto.getCodigoPostal() );
        associado.setEmail( associadoDto.getEmail() );
        associado.setNacionalidade( associadoDto.getNacionalidade() );

        associado.setDataNascimento( associadoDto.getDataNascimento().toLocalDate() );

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

    @Override
    public AssociadoDto paraAssociadoDto(Associado associado) {
        if ( associado == null ) {
            return null;
        }

        AssociadoDto associadoDto = new AssociadoDto();

        associadoDto.setNome( associado.getNome() );
        associadoDto.setNomeMae( associado.getNomeMae() );
        associadoDto.setNomePai( associado.getNomePai() );
        associadoDto.setMorada( associado.getMorada() );
        associadoDto.setConcelho( associado.getConcelho() );
        associadoDto.setDistrito( associado.getDistrito() );
        associadoDto.setTelemovel( associado.getTelemovel() );
        associadoDto.setDdi( associado.getDdi() );
        associadoDto.setCodigoPostal( associado.getCodigoPostal() );
        associadoDto.setEmail( associado.getEmail() );
        associadoDto.setNacionalidade( associado.getNacionalidade() );

        associadoDto.setDataNascimento( java.time.LocalDateTime.of(associado.getDataNascimento(), java.time.LocalTime.MIN) );

        return associadoDto;
    }
}
