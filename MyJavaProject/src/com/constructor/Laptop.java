package com.constructor;

public class Laptop {
	String brand;
	int ram;
	String processor;
	Laptop()
	{
		brand="lenovo";
		ram=3;
		processor="core i5";
	}
	Laptop(String brand,int ram,String processor)
	{
		this.brand=brand;
		this.ram=ram;
		this.processor=processor;
	}


}
