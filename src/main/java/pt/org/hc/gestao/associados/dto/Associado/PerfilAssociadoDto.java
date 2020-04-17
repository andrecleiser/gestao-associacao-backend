package pt.org.hc.gestao.associados.dto.Associado;

import java.time.LocalDate;

public class PerfilAssociadoDto {
    
    private Integer idAssociado;
    private String nome;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private String foto;

    public Integer getIdAssociado() {
        return this.idAssociado;
    }

    public void setIdAssociado(Integer idAssociado) {
        this.idAssociado = idAssociado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
