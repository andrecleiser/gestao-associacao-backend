package pt.org.hc.gestao.associados.dto.Associado;

import java.time.LocalDate;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@RegisterForReflection
public class PerfilAssociadoDto {

    public PerfilAssociadoDto() {}
    
    private Integer idAssociado;
    private String nome;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private String foto;
}
