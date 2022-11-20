package org.techeasy.messenger.resources;

import java.util.List;

import org.techeasy.messenger.model.Car;
import org.techeasy.messenger.service.CarService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/carinfo")
public class CarResource {

	CarService carService = new CarService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Car> getCar() {
		return carService.getCarInfo();
	}
}
