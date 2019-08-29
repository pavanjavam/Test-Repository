package com.nonstaticblock;

public class Demo {
	static int i=10;
	int j=20;
	{
		System.out.println(i);
		System.out.println(Demo.i);
		System.out.println(this);
		System.out.println(j);
		this.j=30;
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ob=new Demo();

	}

}
