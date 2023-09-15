package com.bptn.teachback.week4;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class FruitWarehouse {

	public static int comparebyCount(Fruit a, Fruit b)
    {
        return a.getCount().compareTo(b.getCount());
    }

	
	public static void main(String[] args) {
		
		MessagePrint.printMessage();
		List<Fruit> fruitList = new ArrayList<>();
		
		fruitList.add(new Fruit("pineapple",15));
		fruitList.add(new Fruit("avocado",25));
		fruitList.add(new Fruit("pear",33));
		fruitList.add(new Fruit("lemon",54));
		fruitList.add(new Fruit("clementine",9));
		

		System.out.println("Current Inventory:");
		fruitList.forEach(fruit->System.out.println(fruit));
		
		
		//Implement Functional Interface :computeTotalValue
		// checking total weight of product
		
		computeTotalValue weightTotal =  (count,unit)-> count*unit;
		
		System.out.println("\nTotal weight of lemons:");
		System.out.println(fruitList.get(3).getName() 
							+"\t: "
							+weightTotal.getTotal(fruitList.get(3).getCount(), 0.25)
							+ "kg");
			
		//checking total value of a product
		computeTotalValue valueTotal =  (count,unitValue)-> count*unitValue;
		
		System.out.println("\nTotal value of pineapple:");
		System.out.println(fruitList.get(0).getName() 
							+"\t: $"
							+valueTotal.getTotal(fruitList.get(0).getCount(),4.5 )
							);
		
		
		//Using Lambda to repeat action to all units
		// inventory injection of 25 unit to each product
		/*
		for(Fruit fruit:fruitList) {
			
			fruit.addTocount(25);
		}
		*/
	
		fruitList.forEach(fruit -> fruit.addTocount(25));
		
		System.out.println("\nAfter inventory injection:");
		
		fruitList.forEach(System.out::println);
		
		// using instance method reference
		ComparisonProvider comparator = new ComparisonProvider();
		Collections.sort(fruitList,comparator::compareByName);
		System.out.println("\nAfter sort() by name:\n ");
		fruitList.forEach(System.out::println);
		

		Collections.sort(fruitList,Comparator.comparing(Fruit::getCount));
		Collections.reverse(fruitList);
//		Collections.sort(fruitList,FruitWarehouse::compareByCount);
		
		System.out.println("\nAfter sort() by desc count:\n ");
		fruitList.forEach(System.out::println);
		
	}
	
}
