package com.constructor;

public class Shirt {

		// TODO Auto-generated method stub
		String colour;
		int size;
		String productCode;
		static int countShirt;
		
		Shirt()
		{
			countShirt++;
			productCode="VAN"+countShirt;
		}
		Shirt(String colour,int size)
		{
			this();
			this.colour=colour;
			this.size=size;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Shirt v1=new Shirt();
			Shirt v2=new Shirt("BLACK",34);
			Shirt v3=new Shirt("BLACK",36);
			Shirt v4=new Shirt("PINK",38);
			System.out.println("colour of shirt: "+v1.colour+" as size; "+v1.size+" with "+v1.productCode);
			System.out.println("colour of shirt: "+v2.colour+" as size; "+v2.size+" with "+v2.productCode);
			System.out.println("colour of shirt: "+v3.colour+" as size; "+v3.size+" with "+v3.productCode);
			System.out.println("colour of shirt: "+v4.colour+" as size; "+v4.size+" with "+v4.productCode);
			System.out.println("no.of shirts are :"+countShirt );

		}


	}


