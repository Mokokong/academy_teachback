package com.bptn.teachback.week2.Encap;

public class EncapTestClass {

	public static void main(String[] args) {
		
		
		//Un-encapsulated test 
		Person d = new Person ("Tom", 80,173);
		
//		System.out.println(d.name);
//		System.out.println(d.weight + "kg");
//		
		System.out.println("======================\n");
		
		//Encapsulated test
		System.out.println(d.getName());
		System.out.println(d.getWeight()+ "kg");
//		System.out.println(d.get);
		System.out.println(d.toString());
		System.out.println("======================\n");
		
		
		
	}

}
