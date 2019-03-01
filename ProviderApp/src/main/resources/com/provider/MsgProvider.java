package com.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/provider")
public class MsgProvider {
	@GET
	@Path("/msg")
	public String msgProvider() {
		
		return "Welcome to REst Application..!!"

	}
}
