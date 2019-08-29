package com.staticmembers;

public class S7 {
	static void test()
	{
		System.out.println("from test()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main begins");
		test();
		System.out.println("+++++++++=");
		S7.test();
		System.out.println("main ends()");

	}

}
