package com.app;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/Message")
public class MessageProvider {
	
	@GET
	public String showA() {
		return "from showA";
	}
	
	@POST
	public String showB() {
		return "from showB";
	}
	
	@PUT
	public String showC() {
		return "from showC";
	}
	
	@DELETE
	public String showD() {
		return "from showD";
	}

}
