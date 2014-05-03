import javax.ws.rs.*;

@Path("/webservice")
public class Status {

	 @GET  
     @Path("/hello")  
     @Produces("text/plain")  
     public String hello(){  
         return "Hello World!!! dineshonjava";      
     }  
}
