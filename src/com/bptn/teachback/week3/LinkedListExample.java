package com.bptn.teachback.week3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	
	public static void main(String[] args) {
		
		LinkedList<Dog> dogList = new LinkedList<>();
		
		
		// add new dogs
		
		dogList.add(new Dog("Banks",20,"German Sherpard"));
		dogList.add(new Dog("Coco",2,"Maltese"));
		dogList.add(new Dog("Reggie",15,"Golden Labrador"));
		
		// iterating through list using for loop
		System.out.println("Print dogList after add:\n");
		
		for (int i = 0; i < dogList.size(); i++) {
			
			System.out.println(dogList.get(i));
			
		}
		
		// add new dog
		
		
		dogList.add(new Dog("Howard",17,"BullDog"));
		dogList.add(new Dog("Juan",1,"Chihuahua"));
		
		System.out.println("\nDogList after 2nd round of adds:\n");
		
		// auto generated for loop using iterator
		for (Iterator<Dog> iterator = dogList.iterator(); iterator.hasNext();) {
//			Dog dog = (Dog) iterator.next();
			System.out.println(iterator.next());
			
		}
		
		
		// remove Reggie using iterator
		
		Iterator <Dog> it = dogList.iterator();
		
		while (it.hasNext()) {

			// checking equals on name and bread not weight
			if (it.next().equals(new Dog("Reggie",150,"Golden Labrador")))
			
			{
				it.remove();
				
			}
		}
		
		
		// re-print after removal
		System.out.println("\nDoglist after removal:\n ");
		for (Iterator<Dog> iterator = dogList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
		
		
	}

}
