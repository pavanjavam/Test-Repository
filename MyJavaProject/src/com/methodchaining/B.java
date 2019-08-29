package com.methodchaining;

public class B {
	int i;
	B initialize(int i)
	{
		this.i=i;
		return this;
	}
	static B createObject()
	{
		return new B();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B.createObject().initialize(10).display();
		B.createObject().initialize(20).display();

	}
	  void display()
	{
		System.out.println("i: "+i);;
	}

}
