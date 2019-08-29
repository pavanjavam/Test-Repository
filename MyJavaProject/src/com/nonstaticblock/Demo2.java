package com.nonstaticblock;

public class Demo2 {
	int i=10;
	{
		System.out.println(i);
		this.i=20;
	}
	Demo2()
	{
		System.out.println("from Demo2()");
	}

}
