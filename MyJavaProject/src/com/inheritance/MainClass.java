package com.inheritance;

public class MainClass extends B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(B1.i);
		System.out.println(B1.j);
		A1.i=100;
		System.out.println(B1.i);
		B1.j=200;
		System.out.println(B1.j);

	}

}
