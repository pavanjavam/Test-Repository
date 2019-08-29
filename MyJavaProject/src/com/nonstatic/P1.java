package com.nonstatic;

public class P1 {
	void test()
	{
		System.out.println("from test()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		P1 ob1=new P1();
		ob1.test();
		System.out.println("the end");

	}

}
