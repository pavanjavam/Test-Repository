package com.constructor;

public class Company {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		System.out.println(e1.id +"   "+e1.name+"   "+e1.salary);
		Employee e2=new Employee(2,"john",24000.00);
		System.out.println(e2.id +"   "+e2.name+"   "+e2.salary);

	}

}
