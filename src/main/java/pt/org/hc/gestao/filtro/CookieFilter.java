package pt.org.hc.gestao.filtro;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;

@Provider
public class CookieFilter implements ContainerRequestFilter {

    private static final Logger LOG = Logger.getLogger(CookieFilter.class);
    
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        for (String name : requestContext.getCookies().keySet()) {
            Cookie cookie = requestContext.getCookies().get(name);
            LOG.info(cookie.getName());
            System.out.println(cookie.getName());
        }
    }

}