package com.constructor;

public class P7 {
	boolean x;
	double y;
	P7(boolean x, double y)
	{
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P7 ob4=new P7(false, 2.2);
		P7 ob5=new P7(true, 3.7);
		P7 ob6=new P7(false, 0.2);
		System.out.println("x: "+ob4.x+"   y: "+ob4.y);
		System.out.println("x: "+ob5.x+"   y: "+ob5.y);
		System.out.println("x: "+ob6.x+"   y: "+ob6.y);

	}

}
