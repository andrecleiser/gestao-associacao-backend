package pt.org.hc.gestao.associados.dto.Associado;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PerfilAssociadoDto {

    public PerfilAssociadoDto() {}
    
    private Integer idAssociado;
    private String nome;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private String foto;
}
