package com.inheritance;

public class P2 extends P1 {
	int j=20;
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println("from IIB of P2()");
	}
	P2()
	{
		System.out.println("from P2()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		P2 obj=new P2();
		System.out.println(obj);
		System.out.println("i:"+obj.i+" j:"+obj.j);
		

	}

}
