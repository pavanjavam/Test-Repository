package com.constructor;

public class P1 {
	P1()
	{
		System.out.println("from constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		P1 ob=new P1();
		System.out.println(new P1());

	}

}
