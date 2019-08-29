package com.arrays;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		System.out.println("elements of array in natural order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("elements of array in reverse order:");
		for(int i=(a.length-1);i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
