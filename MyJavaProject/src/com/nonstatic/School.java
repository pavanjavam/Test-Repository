package com.nonstatic;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("Student name:"+s1.name+"   marks:"+s1.marks);
		Student s2=new Student();
		System.out.println("Student name:"+s2.name+"   marks:"+s2.marks);
		s1.name="pavan";
		s1.marks=90;
		System.out.println("Student name:"+s1.name+"  marks:"+s1.marks);
		s2.name="john";
		s2.marks=99;
		System.out.println("Student name:"+s2.name+"   marks:"+s2.marks);

	}

}
