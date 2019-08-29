package com.array2;

public class A {
	static int[] createArray(int size)
	{
		System.out.println("++++++++");
		int array[]= new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=i+1;
		}
		System.out.println("++++++");
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("________");
		int[] array = createArray(5);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("________");

	}

}
