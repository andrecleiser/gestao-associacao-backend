package pt.org.hc.gestao.associados.dto.mapper;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import pt.org.hc.gestao.associados.dto.AssociadoDto;
import pt.org.hc.gestao.associados.entidade.Associado;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-06T09:05:35+0100",
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
}
