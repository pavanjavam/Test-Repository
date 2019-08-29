package com.constructor;

public class P6 {
	int i;
	P6()
	{
		i=10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6 p1=new P6();
		P6 p2=new P6();
		P6 p3=new P6();
		System.out.println("i value for my 1st object: "+p1.i);
		System.out.println("i value for my 2st object: "+p2.i);
		System.out.println("i value for my 3st object: "+p3.i);

	}

}
