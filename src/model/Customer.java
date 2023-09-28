package model;

public class Customer {
	private String name;
	private double scoop;
	
	public Customer() {
		
	}
	
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScoop() {
		return scoop;
	}

	public void setScoop(double scoop) {
		this.scoop = scoop;
	}


}
