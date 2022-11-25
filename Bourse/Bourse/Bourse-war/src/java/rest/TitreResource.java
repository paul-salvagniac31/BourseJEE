/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import service.ServiceRESTLocal;

/**
 * REST Web Service
 *
 * @author PaulSalvagniac
 */
@Path("bourse/titre/{id}")
public class TitreResource {

    ServiceRESTLocal serviceREST = lookupServiceRESTLocal();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TitreResource
     */
    public TitreResource() {
    }

    /**
     * Retrieves representation of an instance of rest.TitreResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("id") String id) {
        //TODO return proper representation object
        return this.serviceREST.get(id).toString();
        
    }

    /**
     * PUT method for updating or creating an instance of TitreResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    private ServiceRESTLocal lookupServiceRESTLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (ServiceRESTLocal) c.lookup("java:global/Bourse/Bourse-ejb/ServiceREST!service.ServiceRESTLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
