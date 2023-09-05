package com.bptn.teachback.week1;

public class UnaryOperators {

	public static void main(String[] args) {
		/* Post-Increment */
		System.out.printf("\nPost Increment\n");
		int a = 5; 
		int b = a++; 

		System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=5

		/* Pre-Increment */
		System.out.printf("\nPre Increment\n");
		a = 5; 
		b = ++a; 

		System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=6

		/* Post-Decrement */
		System.out.printf("\nPost Decrement\n");
		int aa = 5; 
		int bb = a--; 

		System.out.printf("aa=%d, bb=%d", aa, bb); // Prints out: a=4, b=5

		/* Pre-Decrement */
		System.out.printf("\nPre Decrement\n");
		aa = 5; 
		bb = --aa; 

		System.out.printf("aa=%d, bb=%d", aa, bb); // Prints out: a=4, b=4
	}

}
