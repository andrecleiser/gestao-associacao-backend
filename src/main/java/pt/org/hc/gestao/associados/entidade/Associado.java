package pt.org.hc.gestao.associados.entidade;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Associado {
	@Column(name = "id_associado")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAssociado;
	private String nome;

	@Column(name = "nome_mae")
	private String nomeMae;

	@Column(name = "nome_pai")
	private String nomePai;

	@Column(name = "dt_nascimento")
	private LocalDate dataNascimento;
	private String morada;
	private String concelho;
	private String distrito;
	private String ddi;
	private String telemovel;

	@Column(name = "cd_postal")
	private String codigoPostal;
	private String email;
	private String nacionalidade;
	@Column(name = "foto_base64")
	private String foto;
}