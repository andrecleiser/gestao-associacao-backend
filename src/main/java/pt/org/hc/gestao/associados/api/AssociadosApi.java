package pt.org.hc.gestao.associados.api;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import pt.org.hc.gestao.associados.dto.AssociadoDto;
import pt.org.hc.gestao.associados.dto.AssociadoFotoDto;
import pt.org.hc.gestao.associados.entidade.Associado;
import pt.org.hc.gestao.associados.servico.AssociadoServico;

@Path("/associados")
public class AssociadosApi extends BaseApi {

    @Inject
    AssociadoServico associadoServico;

    private @PathParam("idAssociado") Integer idAssociado;
    private @PathParam("idAssociadoFoto") Integer idAssociadoFoto;

    @GET
    public Response listarAssociados() {
        return Response.ok(this.associadoServico.listarAssociados()).build();
    }

    @GET
    @Path("{idAssociado}")
    public Response listarAssociadoPorId() {
        return Response.ok(this.associadoServico.listarAssociadoPorId(idAssociado)).build();
    }

    @POST
    public Response incluirAssociado(@Valid AssociadoDto associadoDto) {
        Associado novoAssociado = this.associadoServico.incluirAssociado(associadoDto);
        return Response.created(this.obterNovoRecurso(novoAssociado.getIdAssociado())).build();
    }

    @PUT
    @Path("{idAssociado}")
    public Response atualizarAssociado(@Valid AssociadoDto associadoDto) {
        this.associadoServico.atualizarAssociado(this.idAssociado, associadoDto);
        return Response.ok().build();
    }

    @DELETE
    @Path("{idAssociado}")
    public Response excluirAssociad() {
        this.associadoServico.excluriAssociado(idAssociado);
        return Response.noContent().build();
    }

    @PUT
    @Path("{idAssociado}/foto")
    public Response atualizarFoto(AssociadoFotoDto associadoFotoDto) {
        this.associadoServico.atualizarFoto(idAssociado, associadoFotoDto);
        return Response.ok().build();
    }

    @DELETE
    @Path("{idAssociado}/foto")
    public Response excluirFoto() {
        this.associadoServico.excluirFoto(idAssociado);
        return Response.ok().build();
    }

}