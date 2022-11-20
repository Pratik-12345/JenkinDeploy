package org.techeasy.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.techeasy.messenger.model.Car;

public class CarService {

	
	
	public List<Car> getCarInfo() {
		Car car = new Car("Tuson","white",2650000.00);
		Car car2 = new Car("i20","black",900000.00);
		List<Car> carList = new ArrayList<>();
		carList.add(car);
		carList.add(car2);
		return carList;
	}
}
