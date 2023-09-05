package com.bptn.teachback.week2.Encap;


public class Person {
	
	// Fields
//	String name;
//	double weight;
//	double height;
	
	
// encapsulated fields
	private String name;
	private double weight; // in kg
	private double height; // in cm
	
	
	
	Person(){
			
		this.name = "???";
		this.weight = 0.0;
		this.height = 0.0;
	}
	
	Person (String name, double weight, double height)
	{
		this.name = name;
		this.weight = weight;
		this.height = height;
		
	}

	// Setters and Getters
	// Show source route: 
	// right-click->Source->Generate Setters and Getters-> Select All  
	
	
	
	
	@Override
	public String toString() {
		return ("name=" + name + ", weight=" + weight + ", height=" + height) ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	

}
