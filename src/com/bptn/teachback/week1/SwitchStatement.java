package com.bptn.teachback.week1;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int month ;
		
		System.out.println("Enter the month as a number:");
		
		month = sc.nextInt();
		
		
		switch (month) {
		case 1:
		case 5:
			System.out.println("\nThat month is Jan");
			break;

		case 2:
			System.out.println("\nThat month is Feb");
			break;
			
		case 3:
			System.out.println("\nThat month is Mar");
			break;
			
		case 4:
			System.out.println("\nThat month is Apr");
			break;
		default:
			System.out.println("\nWe are still filling out other cases. Thanks for your understanding ");
			break;
		}
		
		
		switch (month) {
		case 1,2,3 ->  System.out.println("\nThat month is Winter");
		
		case 4,5,6 ->  System.out.println("\nThat month is in Spring");
		
		case 7,8,9->  System.out.println("\nThat month is in Summer");
		
		case 10,11,12->  System.out.println("\nThat month is in Fall");
		
		default -> System.out.println("\nThat month does not Exist");
		
		}
		
		
		sc.close();

	}

}
