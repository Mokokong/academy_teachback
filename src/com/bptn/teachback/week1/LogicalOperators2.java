package com.bptn.teachback.week1;

public class LogicalOperators2 {

	public static void main(String[] args) {
		int a = 23; 
		int b = 8;
		int c = 25;

		System.out.println("\n a : "+ a);
		System.out.println("\n b : "+ b);
		System.out.println("\n c: "+ c);
		
		
		
		boolean and = (a > b) && (b > c); 
		boolean or = (a > b) || (b > c); 
		boolean not = !(a > b); 
		
		System.out.println("\n(a > b) && (b > c) : "+ and);
		System.out.println("\n(a > b) || (b > c): "+ or);
		System.out.println("\n !(a > b) : "+ not);
		
		
	}

}
