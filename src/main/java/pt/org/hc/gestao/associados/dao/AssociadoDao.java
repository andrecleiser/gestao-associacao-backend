package pt.org.hc.gestao.associados.dao;

import javax.enterprise.context.RequestScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import pt.org.hc.gestao.associados.entidade.Associado;

@RequestScoped
public class AssociadoDao implements PanacheRepositoryBase<Associado, Integer> {

}