package com.inheritance;

public class Dog extends Animal {
	String breed;
	void sniffs()
	{
		System.out.println("Dog snifs");
	}
	Dog()
	{
		
	}
	Dog(double height,double weight,String breed)
	{
		super(height,weight);
		this.breed=breed;
	}

}
