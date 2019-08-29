package com.nonprimitivearray;

public class Song {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Songs[] s= {new Songs("let",3.4,"down"), new Songs("hipe",4.3,"hi")};
		for(Songs s1 : s)
		{
			System.out.println("title:"+s1.title);
		}

	}

}
