package com.patterns;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=(n-1))
				{
				if(i%2==0)
				System.out.print(0);
				else
					System.out.print(1);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
