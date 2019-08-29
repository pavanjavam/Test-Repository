package com.inheritance;

public class Car extends Vehicle {
	String brand;
	Car()
	{
		
	}
	Car(String colour,int vno,String brand)
	{
		super(colour,vno);
		this.brand=brand;
		
	}

}
