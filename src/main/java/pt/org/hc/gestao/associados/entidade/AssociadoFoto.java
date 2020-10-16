package pt.org.hc.gestao.associados.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_associado_foto")
@AllArgsConstructor @NoArgsConstructor
public class AssociadoFoto extends PanacheEntityBase {
	@Id
	@Column(name = "id_associado")
    public Integer idAssociado;
    
	@Column(name = "foto_base64")
    public String foto;
}