package org.techeasy.messenger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/secure")
public class SecureMessage {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getSecureMessage() {
		return "Welcome to DarkWeb!!";
	}
}
