package com.constructor;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		System.out.println(a1.height+" "+a1.weight);
		Animal a2=new Animal(24.23,340.46);
		System.out.println(a2.height+" "+a2.weight);

	}

}
