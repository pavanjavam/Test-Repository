package com.nonstaticblock;

public class Employee1 {
	static int countEmployee;
	String id;
	String name;
	{
		countEmployee++;
		id="TY"+countEmployee;
	}
	Employee1()
	{
		System.out.println("from Employee()");
	}
	Employee1(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1("sara");
		System.out.println(e1.name+" has "+e1.id+" as id ");
		System.out.println(e2.name+" has "+e2.id+" as id ");
		System.out.println("no.of employees are "+countEmployee);

	}

}
