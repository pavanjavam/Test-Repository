package com.nonstaticblock;

public class Ns1 {
	{
	System.out.println("from IIB-1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
		Ns1 n1=new Ns1();
		System.out.println(new Ns1());
		

	}

}
