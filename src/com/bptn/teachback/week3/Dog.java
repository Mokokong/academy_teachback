package com.bptn.teachback.week3;

import java.util.Objects;

public class Dog {
	
	private String name;
	private double weight; // in kg
	private String breed;
	
	
	public Dog()
	{
		
		this.name = "???";
		this.weight = 0.0;
		this.breed = "???";
	}
	
	Dog (String name, double weight, String breed)
	{
		this.name = name;
		this.weight = weight;
		this.breed = breed;
		
	}

	// setters and getters
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

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "\n[Name: " + name + ", Weight: " + weight +"kg"+ ", Breed: " + breed + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(breed, other.breed) && Objects.equals(name, other.name);
	}
	
	
	

}
