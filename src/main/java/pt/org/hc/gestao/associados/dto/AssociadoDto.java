package pt.org.hc.gestao.associados.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssociadoDto {

    @NotNull(message = "Nome do associado deve ser informado")
    @Length(min = 10, max = 70, message = "Nome do associado deve ter entre 10 e 70 caracteres")
    private String nome;

    @NotNull(message = "Nome da mãe do associado deve ser informado")
    @Size(min = 10, max = 70, message = "Nome da mãe do associado deve ter entre 10 e 70 caracteres")
    private String nomeMae;

    @Size(min = 10, max = 70, message = "Nome da pai do associado deve ter entre 10 e 70 caracteres")
    private String nomePai;

    @NotNull(message = "Data de nascimento do associado deve ser informada")
    @Past(message = "Data de nascimento deve ser anterior ao dia de hoje")
    private LocalDate dataNascimento;

    @NotNull(message = "Morada deve ser informado")
    @Length(min = 20, max = 150, message = "Morada deve ter entre 20 e 150 caracteres")
    private String morada;

    @NotNull(message = "Concelho deve ser informado")
    @Length(min = 3, max = 70, message = "Concelho deve ter entre 3 e 70 caracteres")
    private String concelho;

    @Length(min = 5, max = 70, message = "Distrito deve ter entre 5 e 70 caracteres")
    @NotNull(message = "Distrito deve ser informado")
    private String distrito;
    
    @Length(min = 9, max = 9, message = "Telemóvel deve ter entre 11 e 12 caracteres")
    @NotNull(message = "Telemóvel deve ser informado")
    private String telemovel;

    @Length(min = 2, max = 3, message = "DDI deve ter entre 11 e 12 caracteres")
    private String ddi;

    @Length(min = 7, max = 7, message = "Código postal deve ter 7 caracteres")
    @NotNull(message = "Código Postal deve ser informado")
    private String codigoPostal;

    @Email(message = "Email do associado inválido")
    @Length(min = 10, max = 50, message = "Email deve ter entre 10 e 50 caracteres")
    @NotNull(message = "E-mail deve ser informado")
    private String email;

    @Length(min = 5, max = 30, message = "Nacionalidade deve ter entre 5 e 30 caracteres")
    @NotNull(message = "Nacionalidade deve ser informado")
    private String nacionalidade;
}