package com.constructor;

public class Wrist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch w1=new Watch();
		System.out.println(w1.type+"    "+w1.price);
		Watch w2=new Watch("digital",240.42);
		System.out.println(w2.type+"    "+w2.price);

	}

}
