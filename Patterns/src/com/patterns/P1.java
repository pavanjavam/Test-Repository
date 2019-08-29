package com.patterns;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; char ch='E'; char dh=ch;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j+i<=(n-1);j++)
			{
				System.out.print(ch--);
			}
			dh--;
			ch=dh;
			System.out.println();
		}

	}

}
