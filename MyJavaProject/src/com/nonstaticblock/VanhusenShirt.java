package com.nonstaticblock;

public class VanhusenShirt {
	String colour;
	int size;
	String productCode;
	static int countShirt;
	{
		countShirt++;
		productCode="VAN"+countShirt;
	}
	VanhusenShirt()
	{
		System.out.println("from VanhusenShirt()");
	}
	VanhusenShirt(String colour,int size)
	{
		this.colour=colour;
		this.size=size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VanhusenShirt v1=new VanhusenShirt();
		VanhusenShirt v2=new VanhusenShirt("BLACK",34);
		VanhusenShirt v3=new VanhusenShirt("BLACK",36);
		VanhusenShirt v4=new VanhusenShirt("PINK",38);
		System.out.println("colour of shirt: "+v1.colour+" as size; "+v1.size+" with "+v1.productCode);
		System.out.println("colour of shirt: "+v2.colour+" as size; "+v2.size+" with "+v2.productCode);
		System.out.println("colour of shirt: "+v3.colour+" as size; "+v3.size+" with "+v3.productCode);
		System.out.println("colour of shirt: "+v4.colour+" as size; "+v4.size+" with "+v4.productCode);
		System.out.println("no.of shirts are :"+countShirt );

	}

}
