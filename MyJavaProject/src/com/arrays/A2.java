package com.arrays;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		for(int index=0,j=50;index<a.length;j++)
		{
			if(j%8==0)
			{
				a[index++]=j;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("element present in "+i+ " position is "+a[i]);
		}

	}

}
