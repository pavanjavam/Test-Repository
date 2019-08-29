package com.nonstaticblock;

public class Ns3 {
	{
		System.out.println("from IIB-1");
	}
	Ns3()
	{
		System.out.println("from Ns3()");
	}
	{
		System.out.println("from IIB-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ns3 ob=new Ns3();

	}

}
