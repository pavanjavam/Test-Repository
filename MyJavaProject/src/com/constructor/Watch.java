package com.constructor;

public class Watch {
	String type;
	double price;
	Watch()
	{
		type="analog";
		price=450.59;
	}
	Watch(String type,double price)
	{
		this.type=type;
		this.price=price;
	}

}
