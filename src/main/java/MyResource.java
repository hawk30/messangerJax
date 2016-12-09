package src.main.java;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by oracle on 6/12/16.
 */
@Path("{pparam}/test")

public class MyResource {
    @PathParam("pparam") private String paramExample;
    @QueryParam("query") private String queryexample;
    @GET
    @Produces(MediaType.TEXT_PLAIN)

    public String getString(){
        return "it  workled "+ "path param value is: "+ paramExample +" query param value is: "+queryexample;
    }
}
