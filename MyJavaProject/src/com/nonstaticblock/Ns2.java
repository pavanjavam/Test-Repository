package com.nonstaticblock;

public class Ns2 {
	{
		System.out.println("from IIB-1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ffrom main");
		Ns2 ob=new Ns2();
		System.out.println("main ends");

	}
	{
		System.out.println("from IIB-2");
	}


}
