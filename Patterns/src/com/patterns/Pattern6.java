package com.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=i)
				System.out.print(i+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
