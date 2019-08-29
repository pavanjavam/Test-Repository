// write a program to design a class having the following property known as color, name,
//length(double), price(int)
// design a method known as initialize to assign a value
//the method should accept the value to be initialized
package com.nonstatic;

public class Marker {
	String colour;
	String name;
	double length;
	int price;
	void initialize(String colour,String name,double length,int price)

	{
		this.colour=colour;
		this.name=name;
		this.length=length;
		this.price=price;
		System.out.println("colour:"+this.colour);
		System.out.println("name  :"+this.name);
		System.out.println("length:"+this.length);
		System.out.println("price :"+this.price);
		System.out.println();

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker b=new Marker();
		b.initialize("pink","cello",5.5,100);
		b.initialize("black", "Rorito", 5.0, 120);
		
	}

}
