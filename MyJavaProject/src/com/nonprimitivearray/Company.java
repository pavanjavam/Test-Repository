package com.nonprimitivearray;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Employee e1=new Employee(1,"pavan",90);
		Employee e2=new Employee(2,"kumar",89);
		Employee e3=new Employee(3,"john",91);
		Employee e4=new Employee(4,"wick",91); */
		
		Employee[] employee=new Employee[4];
		employee[0]=new Employee(1,"pavan",90);
		employee[1]=new Employee(2,"kumar",99);
		employee[2]=new Employee(3,"john",89);
		employee[3]=new Employee(4,"wick",91); 
		
		/*System.out.print("employee id:"+employee[0].id+" name:"+employee[0].name+" salary:"+employee[0].salary);
		System.out.println();
		System.out.print("employee id:"+employee[1].id+" name:"+employee[1].name+" salary:"+employee[1].salary);
		System.out.println();
		System.out.print("employee id:"+employee[2].id+" name:"+employee[2].name+" salary:"+employee[2].salary);
		System.out.println();
		System.out.print("employee id:"+employee[3].id+" name:"+employee[3].name+" salary:"+employee[3].salary);
		*/
		for(int i=0;i<employee.length;i++)
		{
			System.out.print("employee id:"+employee[i].id+" name:"+employee[i].name+" salary:"+employee[i].salary);
			System.out.println();
		}

	}

}
