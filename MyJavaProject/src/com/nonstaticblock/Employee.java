package com.nonstaticblock;

public class Employee {
	static int count;
	String id;
	{
		count++;
		id="TY"+count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		System.out.println(ob.id);
		Employee ob2=new Employee();
		Employee ob3=new Employee();
		System.out.println(ob2.id);
		System.out.println(ob3.id);
		System.out.println(count);

	}

}
