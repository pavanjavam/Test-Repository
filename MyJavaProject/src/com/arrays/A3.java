package com.arrays;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		for(int index=0,j=10;index<a.length;j++)
		{
			if(j%2==0)
			{
				a[index++]=j;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(i%3==0)
			System.out.println("element present in "+i+ " position is "+a[i]);
		}

	}

}
