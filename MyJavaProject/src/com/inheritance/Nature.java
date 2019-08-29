package com.inheritance;

public class Nature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Black",1,"BMW");
		Vehicle v=new Vehicle("pink",2);
		System.out.println("Colour:"+c.colour+" vehicle no:"+c.vno+" brand:"+c.brand);
		System.out.println("Colour:"+v.colour+" vehicle no:"+v.vno);

	}

}
