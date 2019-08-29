package com.constructor;

public class Lcompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop();
		System.out.println(l1.brand+" "+l1.ram+" "+l1.processor);
		Laptop l2=new Laptop("dell",4,"core i3");
		System.out.println(l2.brand+" "+l2.ram+" "+l2.processor);
		
		

	}

}
