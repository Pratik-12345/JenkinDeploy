package org.techeasy.messenger.model;

public class Car {

	private String model;
	private String color;
	private double price;
	
	
	public Car() {
	}
	
	
	public Car(String model, String color, double price) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
	}


	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
