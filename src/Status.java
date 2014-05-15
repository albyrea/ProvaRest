import javax.ws.rs.*;

@Path("/webservice")
public class Status {

	 @GET  
     @Path("/hello")  
     @Produces("text/plain")  
     public String hello(){  
         return "Hello World!!! dineshonjava";      
     }  
	 
	 @GET
	 @Path("/hello/{nome}/{cognome}")
	 @Produces("text/plain")
	 public String helloWithName(@PathParam("nome") String varX,
	     @PathParam("cognome") String varY) {
	         
		 return "Benvenuto, " + varX + " " + varY;
	 }
}
