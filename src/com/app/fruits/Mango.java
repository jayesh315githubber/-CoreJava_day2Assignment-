package com.app.fruits;

public class Mango extends Fruits {

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
	}

	@Override
	public String taste() {
		return "sweet";
	}

	public void pulp() {
		System.out.println("Name: " + super.getName() + " Color: " + super.getColor() + " creating  pulp!");
	}

}
