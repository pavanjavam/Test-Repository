package com.inheritance;

public class Vehicle {
	String colour;
	int vno;
	void move()
	{
		System.out.println("Vehicle is moving");
	}
	Vehicle()
	{
		
	}
	Vehicle(String colour,int vno)
	{
		this.colour=colour;
		this.vno=vno;
	}

}
