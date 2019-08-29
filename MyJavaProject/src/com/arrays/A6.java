package com.arrays;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		//storing the whole numbers into the array
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//creating another array
		int b[]=new int[5];
		//storing the whole numbers in reverse order into array b
		for(int i=(a.length-1),j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}
		System.out.println("displaying elements present in new array"); 
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("displaying elements in new array at odd indices:");
		for(int i=0;i<b.length;i++)
		{
			if(i%2==1)
				System.out.println(b[i]);
		}
		

	}

}
