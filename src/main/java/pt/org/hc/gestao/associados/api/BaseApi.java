package pt.org.hc.gestao.associados.api;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BaseApi {

    @Context UriInfo uriInfo;

    public URI obterNovoRecurso(final Integer idNovoRecurso) {
        return uriInfo.getAbsolutePathBuilder().path(idNovoRecurso.toString()).build();
    }
}