package com.bptn.teachback.week2.Inheritance;



public class BodyBuilder extends Person {
	
	
	//Fields
	private double deadlift;
	private double squat;
	private double  BMI;
	
	
	BodyBuilder(String name, double weight, double height, double deadlift, double squat){
		
		super(name,weight, height);
		this.deadlift = deadlift;
		this.squat = squat;
		BMI = getWeight()/ Math.pow((getHeight()/100),2);
		
	}

	// Setters and getters
	public double getDeadlift() {
		return deadlift;
	}


	public void setDeadlift(double deadlift) {
		this.deadlift = deadlift;
	}


	public double getSquat() {
		return squat;
	}


	public void setSquat(double squat) {
		this.squat = squat;
	}


	public double getBMI() {
		return BMI;
	}

	// only call it after changing weight or height
	
	public void setBMI() {
		
		BMI = getWeight()/ Math.pow((getHeight()/100),2);
	}
	
//	
	public String toString()
	{
		
		String parentInfo = super.toString();
		String gymInfo = (", deadlift=" + deadlift + ", squat=" + squat + ", BMI =" + BMI);
		return parentInfo+ gymInfo;
	}
	
	
	
	
	
	
}
