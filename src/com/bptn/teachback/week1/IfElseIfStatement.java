package com.bptn.teachback.week1;

import java.util.Scanner;

public class IfElseIfStatement {

	

	

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("\n\n You wake up in a clearing."
	    		+ "\n Your body is covered by a parachute."
	    		+ "\n After getting your bearings , you notice the following" 
	    		+ ".\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
	    String command = scan.nextLine();
	    if (command.equals("n")) 
	    {
	        System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
	    }
	    
	    else if (command.equals("s")) {
	    	
	    	System.out.println("You get to the edge of the water. \nYou hear seagulls crying and see whales splashing in the distance.\nDo you go into the water?");
			
		}else if (command.equals("e")) {
			
			System.out.println("You get to the beach shack.\nThere is no one there.\nYou find a rusty knife.\nDo you take it?");
			
		}else if (command.equals("w")) {
			
			System.out.println("You come to a cave.\nIt is dark inside.\nDo you go inside?");
			
		}
		else {
			
			System.out.println("Standing still is an option but not much of an adventure");
		}
	   
	    
	    System.out.println("End of adventure!");   
	    scan.close();
	  
	

	}
}
