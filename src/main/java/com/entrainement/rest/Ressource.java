package com.entrainement.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class Ressource {
	 @GET
	    public String sayHello() {
	        return "Hello World";
	    }
	}