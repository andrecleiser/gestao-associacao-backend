package pt.org.hc.gestao.associados.dto.Associado;

import java.time.LocalDateTime;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@RegisterForReflection
public class AssociadoDto {

    public AssociadoDto() {}

    @NotNull(message = "Nome do associado deve ser informado")
    @Length(max = 70, message = "Nome do associado deve ter até 70 caracteres")
    private String nome;

    @NotNull(message = "Nome da mãe do associado deve ser informado")
    @Length(max = 70, message = "Nome da mãe do associado deve ter até 70 caracteres")
    private String nomeMae;

    @Length(max = 70, message = "Nome da pai do associado deve ter até 70 caracteres")
    private String nomePai;

    @NotNull(message = "Data de nascimento do associado deve ser informada")
    @Past(message = "Data de nascimento deve ser anterior ao dia de hoje")
    @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime dataNascimento;

    @Length(max = 100, message = "Morada deve ter até 100 caracteres")
    private String morada;
    
    @Length(max = 70, message = "Concelho deve ter até 70 caracteres")
    private String concelho;
    
    @Length(max = 70, message = "Distrito deve ter até 70 caracteres")
    private String distrito;
    
    @Length(max = 9, message = "Telemóvel deve ter até 12 caracteres")
    private String telemovel;
    
    @Length(max = 3, message = "DDI deve ter até 12 caracteres")
    private String ddi;
    
    @Length(max = 8, message = "Código postal deve ter até 8 caracteres")
    private String codigoPostal;
    
    @Email(message = "Email do associado inválido")
    @Length(max = 50, message = "Email deve ter até 50 caracteres")
    @NotNull(message = "E-mail deve ser informado")
    private String email;
    
    @Length(max = 30, message = "Nacionalidade deve ter até 30 caracteres")
    @NotNull(message = "Nacionalidade deve ser informado")
    private String nacionalidade;
}