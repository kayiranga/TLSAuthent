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

import com.kayiranga.restws.model.User;

@Consumes("application/json")
@Produces("application/json")
@Path("/userservice")
public interface UserService {

	@Path("/users")
	@GET
	List<User> getUsers();

	@Path("/users/{id}")
	@GET
	User getUser(@PathParam("id") int id);

	@Path("/users")
	@POST
	Response createUser(User user);

	@Path("/Users")
	@PUT
	Response updateUser(User user);


}