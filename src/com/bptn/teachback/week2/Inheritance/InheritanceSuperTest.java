package com.bptn.teachback.week2.Inheritance;

public class InheritanceSuperTest {

	public static void main(String[] args) {
		

		BodyBuilder g = new BodyBuilder("Bruce", 100, 165, 75, 100)	;
		
		
		System.out.println("======================\n");
				
		//Encapsulated test
		System.out.println(g.getName());
		System.out.println(g.getWeight()+ "kg");
		System.out.println(g.toString());
		
		System.out.println("======================\n");
		
		
	}
	
	

}
