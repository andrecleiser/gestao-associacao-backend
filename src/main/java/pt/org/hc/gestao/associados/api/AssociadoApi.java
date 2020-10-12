package pt.org.hc.gestao.associados.api;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.jwt.JsonWebToken;

import io.quarkus.security.Authenticated;
import pt.org.hc.gestao.associados.dto.Associado.AssociadoDto;
import pt.org.hc.gestao.associados.entidade.Associado;
import pt.org.hc.gestao.associados.servico.associado.AssociadoServico;

@Path("/associados")
public class AssociadoApi extends BaseApi {

    @Inject
    AssociadoServico associadoServico;

    @Inject
    JsonWebToken jwt;

    private @PathParam("idAssociado") Integer idAssociado;
    private @PathParam("idAssociadoFoto") Integer idAssociadoFoto;

    @GET
    @Path("perfis")
    @Authenticated
    public Response listarPerfilAssociados() {
        return Response.ok(this.associadoServico.listarPerfilAssociados()).build();
    }

    @GET
    @Path("{idAssociado}")
    @Authenticated
    public Response listarAssociadoPorId() {
        return Response.ok(this.associadoServico.listarAssociadoPorId(idAssociado)).build();
    }

    @POST
    @Authenticated
    public Response incluirAssociado(@Valid AssociadoDto associadoDto) {
        Associado novoAssociado = this.associadoServico.incluirAssociado(associadoDto);
        return Response.created(this.obterNovoRecurso(novoAssociado.getIdAssociado())).build();
    }

    @PUT
    @Path("{idAssociado}")
    @Authenticated
    public Response atualizarAssociado(@Valid AssociadoDto associadoDto) {
        this.associadoServico.atualizarAssociado(this.idAssociado, associadoDto);
        return Response.ok().build();
    }

    @DELETE
    @Path("{idAssociado}")
    @Authenticated
    public Response excluirAssociad() {
        this.associadoServico.excluriAssociado(idAssociado);
        return Response.noContent().build();
    }

    @PUT
    @Path("{idAssociado}/foto")
    @Consumes(MediaType.TEXT_PLAIN)
    @Authenticated
    public Response atualizarFoto(String associadoFotoBase64) {
        this.associadoServico.atualizarFoto(idAssociado, associadoFotoBase64);
        return Response.ok().build();
    }

    @DELETE
    @Path("{idAssociado}/foto")
    @Authenticated
    public Response excluirFoto() {
        this.associadoServico.excluirFoto(idAssociado);
        return Response.ok().build();
    }

}