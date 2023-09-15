package com.bptn.teachback.week4;


import java.util.Comparator;

public class Fruit implements Comparator<Fruit> {
	
	private String name;
	private Integer count;
	
	
	public Fruit(String name, int count) {
		
		this.name = name;
		this.count = count;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	public void addTocount(int value) {
		
		count+=value;
	}


	@Override
	public String toString() {
		return "name:" + name + "\t count:" + count ;
	}


	@Override
	public int compare(Fruit fruit1, Fruit fruit2) {
		
		return fruit1.getName().compareTo(fruit2.getName());
	}

	
}
