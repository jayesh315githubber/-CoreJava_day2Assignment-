package com.app.fruits;

public abstract class Fruits {

//	 color : String , weight : double , name:String, fresh : boolean

	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public Fruits(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = true;
	}	

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String toString() {
		return "name  : "+name + " color : "+color+ " weight : "+ weight;
	}
	
	public abstract String taste();

	public String getName() {
		return this.name;
	}
	

}
