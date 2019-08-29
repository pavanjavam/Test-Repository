package com.nonstatic;

public class Exercise {
	static int i;
	int j;
	void context()
	{
		// accessing static member inside non-static context
		System.out.println(i);
		i=1;
		System.out.println(this.i); // using this keyword // not recommended
		System.out.println(Exercise.i);
		// accessing non-static member from non-static context
		System.out.println(j);  // directly
		System.out.println(this.j); // by using this keyword
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accessing static member inside static context
		System.out.println(i); //directly
		System.out.println(Exercise.i); //by using class name
		// accessing non-static member from static context
		Exercise ob=new Exercise();
		ob.j=10;
		ob.context();
		

	}

}
