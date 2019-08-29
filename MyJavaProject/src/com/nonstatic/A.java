package com.nonstatic;

public class A {
	int i;
	void test()
	{
		System.out.println("from test");
		System.out.println(i);
		System.out.println("this:"+this);
		i=20;
		System.out.println(this.i);
		System.out.println("end of test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		A ob=new A();
		ob.i=10;
		ob.test();
		//System.out.println(this);
		System.out.println("ob:"+ob);
		System.out.println("the end");

	}

}
