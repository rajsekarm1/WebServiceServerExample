package com.jwsur.ch2.restlet;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.data.Status;
import org.restlet.data.MediaType;

public class PlainResource extends ServerResource {
    public PlainResource() { }

    @Get
    public Representation toPlain() {
	String adages = Adages.toPlain();
	setStatus(Status.SUCCESS_OK);
	return new StringRepresentation(adages, MediaType.TEXT_PLAIN);
    }
}


