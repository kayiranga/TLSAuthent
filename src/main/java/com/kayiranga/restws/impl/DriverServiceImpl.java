package com.kayiranga.restws.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;


import com.kayiranga.restws.model.Driver;
import com.kayiranga.restws.repos.DriverRepository;
import com.kayiranga.restws.service.DriverService;
//serviceImpl
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepository repository;
	@Override
	public List<Driver> getDrivers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Driver getDriver(int id) {
		// TODO Auto-generated method stub
		return  repository.findById(id).get();
	}

	@Override
	public Response createDriver(Driver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
