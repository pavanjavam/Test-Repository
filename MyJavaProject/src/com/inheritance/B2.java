package com.inheritance;

public class B2 extends A2 {
	int y;
	public static void main(String[] args) {
		B2 ob1=new B2();
		System.out.println(ob1);
		System.out.println("x:"+ob1.x);
		System.out.println("y:"+ob1.y);
		
		A2 ob2=new A2();
		System.out.println("x:"+ob2.x);
		ob2.x=200;
		System.out.println("x:"+ob2.x);
	}

}
