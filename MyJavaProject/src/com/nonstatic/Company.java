package com.nonstatic;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1;
		e1=new Employee();
		System.out.println("employee name: "+e1.name+" id: "+e1.id);
		Employee e2=new Employee();
		System.out.println("employee name: "+e2.name+" id: "+e2.id);
		e2.name="chikku";
		e2.id=1;
		System.out.println("employee name: "+e2.name+" id: "+e2.id);
		Employee e3=new Employee();
		e3.name="chikki";
		e3.id=2;
		System.out.println("employee name: "+e3.name+" id: "+e3.id);
		

	}

}
