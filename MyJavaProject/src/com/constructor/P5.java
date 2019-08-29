package com.constructor;

public class P5 {
	int j;
	static int i;
	P5()                                //constructor is a non-static context
	{
		i=10;                           // accessing static member directly
		System.out.println(P5.i);       //10 // accessing static member using class name
		System.out.println(j);          //0 //accessing non static member directly
		j=20;
		System.out.println(this.j);     //20 //accessing non static number using this
		System.out.println(this);       // P5@15db9742
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P5 ob=new P5();

	}

}
