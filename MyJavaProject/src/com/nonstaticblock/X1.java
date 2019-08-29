package com.nonstaticblock;

public class X1 {
	static int count;
	{
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X1 ob1=new X1();
		X1 ob2=new X1();
		X1 ob3=new X1();
		X1 ob4=new X1();
		X1 ob5=new X1();
		X1 ob6=new X1();
		X1 ob7=new X1();
		X1 ob8=new X1();X1 ob9=new X1();
		System.out.println(count);

	}

}
