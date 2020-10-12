package pt.org.hc.gestao.associados.servico.associado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

import io.quarkus.panache.common.Sort;
import pt.org.hc.gestao.associados.dto.Associado.AssociadoDto;
import pt.org.hc.gestao.associados.dto.Associado.PerfilAssociadoDto;
import pt.org.hc.gestao.associados.dto.mapper.AssociadoMapper;
import pt.org.hc.gestao.associados.entidade.Associado;

@RequestScoped
public class AssociadoServico {

    @Inject
    AssociadoMapper associadoMapper;

    public List<PerfilAssociadoDto> listarPerfilAssociados() {
        final ArrayList<PerfilAssociadoDto> listaPerfilAssociadoDto = new ArrayList<PerfilAssociadoDto>();
        Associado.listAll(Sort.by("nome")).forEach(
                associado -> listaPerfilAssociadoDto.add(this.associadoMapper.paraPerfilDto((Associado) associado)));
        return listaPerfilAssociadoDto;
    }

    public AssociadoDto listarAssociadoPorId(final Integer idAssociado) {
        // TODO - FAZER VALIDAÇÃO
        final Optional<Associado> associado = Associado.findByIdOptional(idAssociado);
        return this.associadoMapper.paraAssociadoDto(associado.get());
    }

    @Transactional
    public Associado incluirAssociado(final AssociadoDto associadoDto) {

        final Associado associado = this.associadoMapper.paraEntidade(associadoDto);
        associado.persist();
        return associado;
    }

    @Transactional
    public void atualizarAssociado(final Integer idAssociado, @Valid final AssociadoDto associadoDto) {

        final Optional<Associado> associadoOptional = Associado.findByIdOptional(idAssociado);
        // TODO - VALIDAR QUANDO NÃO EXISTIR ASSOCIADO
        atualizarDados(associadoDto, associadoOptional);
        associadoOptional.get().persist();
    }

    private void atualizarDados(final AssociadoDto associadoDto, final Optional<Associado> associadoOptional) {
        associadoOptional.get().setNome(associadoDto.getNome());
        associadoOptional.get().setNomeMae(associadoDto.getNomeMae());
        associadoOptional.get().setNomePai(associadoDto.getNomePai());
        associadoOptional.get().setDataNascimento(associadoDto.getDataNascimento().toLocalDate());
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
    public void excluriAssociado(final Integer idAssociado) {
        final Optional<Associado> associado = Associado.findByIdOptional(idAssociado);
        // TODO - VALIDAR QUANDO NÃO EXISTIR ASSOCIADO
        associado.get().delete();
    }

    @Transactional
    public void atualizarFoto(Integer idAssociado, String associadoFotoBase64) {
        Associado associado = Associado.findById(idAssociado);
        associado.setFoto(associadoFotoBase64);
        // TODO - VALIDAR QUANDO NÃO EXISTIR ASSOCIADO
        associado.persist();
    }

    @Transactional
    public void excluirFoto(final Integer idAssociado) {
        Associado.update("foto = null where idAssociado = ?1", idAssociado);
    }

}
