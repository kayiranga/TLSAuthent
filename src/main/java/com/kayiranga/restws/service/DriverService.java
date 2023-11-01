package com.kayiranga.restws.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


import com.kayiranga.restws.model.Driver;

@Consumes("application/json")
@Produces("application/json")
@Path("/driverservice")
public interface DriverService {
	
	@Path("/drivers")
	@GET
	List<Driver> getDrivers();

	@Path("/drivers/{id}")
	@GET
	Driver getDriver(@PathParam("id") int id);

	@Path("/drivers")
	@POST
	Response createDriver(Driver driver);

	@Path("/drivers")
	@PUT
	Response updateDriver(Driver driver);

}
