package com.constructor;

public class Employee {
	int id;
	String name;
	double salary;
	Employee()
	{
		id=1;
		name="pavan";
		salary=24000.00;
		
	}
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

}
