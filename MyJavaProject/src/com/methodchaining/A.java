package com.methodchaining;

public class A {
	int i;
	static A createObject()
	{
		return new A();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=A.createObject();
		System.out.println(ob.i);
		ob.i=10;
		System.out.println(ob.i);

	}

}
