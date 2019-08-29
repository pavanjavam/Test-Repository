package com.constructor;

public class C {
	C()
	{
		this(10);
		System.out.println("from C()");
	}
	C(int i)
	{
		this(10.0);
		System.out.println("from c(int)");
	}
	C(double i)
	{
		System.out.println("from C(double)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob1=new C();
		System.out.println();
		C ob2=new C(10);
		System.out.println();
		C ob3=new C(20.0);

	}

}
