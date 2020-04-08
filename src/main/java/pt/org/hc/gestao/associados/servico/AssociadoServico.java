package pt.org.hc.gestao.associados.servico;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

import pt.org.hc.gestao.associados.dao.AssociadoDao;
import pt.org.hc.gestao.associados.dto.AssociadoDto;
import pt.org.hc.gestao.associados.dto.AssociadoFotoDto;
import pt.org.hc.gestao.associados.dto.mapper.AssociadoMapper;
import pt.org.hc.gestao.associados.entidade.Associado;

@RequestScoped
public class AssociadoServico {

    @Inject
    AssociadoDao associadoDao;

    @Inject
    AssociadoMapper associadoMapper;

    public List<Associado> listarAssociados() {
        return this.associadoDao.listAll();
    }

    public Associado listarAssociadoPorId(Integer idAssociado) {
        return this.associadoDao.findById(idAssociado);
    }

    @Transactional
    public Associado incluirAssociado(AssociadoDto associadoDto) {

        Associado associado = this.associadoMapper.paraEntidade(associadoDto);
        this.associadoDao.persist(associado);
        return associado;
    }

    @Transactional
    public void atualizarAssociado(Integer idAssociado, @Valid AssociadoDto associadoDto) {

        Optional<Associado> associadoOptional = this.associadoDao.findByIdOptional(idAssociado);
        // TODO - VALIDAR QUANDO NÃO EXISTIR ASSOCIADO
        atualizarDados(associadoDto, associadoOptional);
    }

    private void atualizarDados(AssociadoDto associadoDto, Optional<Associado> associadoOptional) {
        associadoOptional.get().setNome(associadoDto.getNome());
        associadoOptional.get().setNomeMae(associadoDto.getNomeMae());
        associadoOptional.get().setNomePai(associadoDto.getNomePai());
        associadoOptional.get().setDataNascimento(associadoDto.getDataNascimento());
        associadoOptional.get().setMorada(associadoDto.getMorada());
        associadoOptional.get().setConcelho(associadoDto.getConcelho());
        associadoOptional.get().setDistrito(associadoDto.getDistrito());
        associadoOptional.get().setDdi(associadoDto.getDdi());
        associadoOptional.get().setTelemovel(associadoDto.getTelemovel());
        associadoOptional.get().setCodigoPostal(associadoDto.getCodigoPostal());
        associadoOptional.get().setEmail(associadoDto.getEmail());
        associadoOptional.get().setNacionalidade(associadoDto.getNacionalidade());
    }

    @Transactional
    public void excluriAssociado(Integer idAssociado) {
        Optional<Associado> associado = this.associadoDao.findByIdOptional(idAssociado);
        // TODO - VALIDAR QUANDO NÃO EXISTIR ASSOCIADO
        this.associadoDao.delete(associado.get());
    }
    
    @Transactional
    public void atualizarFoto(Integer idAssociado, AssociadoFotoDto associadoFotoDto) {
        Associado associado = this.associadoDao.findById(idAssociado);
        associado.setFoto(associadoFotoDto.getFoto());
        // TODO - VALIDAR QUANDO NÃO EXISTIR ASSOCIADO
        this.associadoDao.persist(associado);
    }

    @Transactional
	public void excluirFoto(Integer idAssociado) {
        this.associadoDao.update("foto = null where idAssociado = ?1", idAssociado);
	}

}
