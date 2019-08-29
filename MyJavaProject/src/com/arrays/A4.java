package com.arrays;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		int[] b=new int[5];
		//storing all the numbers are divisible by 5
		for(int index=0,j=0;index<a.length;j++)
		{
			if(j%5==0)
			{
				a[index++]=j;
			}
		}
		//copy the contents of a into the array b
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		//displaying odd indices values inside array b
		for(int i=0;i<b.length;i++)
		{
			if(i%2==1)
			System.out.println("element present in "+i+ " position is "+b[i]);
		}

	}

}
