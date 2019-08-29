package com.patterns;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k++%2);
			}
			System.out.println();
		}


	}

}
