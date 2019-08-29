package com.methodchaining;

public class C {
	int i,j;
	
		
	C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	static C generateObject(int i,int j)
	{
		return new C(i,j);
	}
	C initialize(int i,int j)
	{
		
		this.i=i;
		this.j=j;
		return this;
	}
	void display()
	{
		System.out.println("i: "+i);
		System.out.println("j: "+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob= C.generateObject(10,20);
		ob.display();
		ob.initialize(100, 200).display();

	}

}
