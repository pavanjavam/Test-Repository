package com.nonprimitivearray;

public class Playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Songs[] c=new Songs[7];
		c[0]=new Songs("senorita",3.2,"shawn mendes");
		c[1]=new Songs("don't let me down",2.8,"shawn mendes");
		c[2]=new Songs("on my way",9,"alan walker");
		c[3]=new Songs("hunting",4.2,"john w");
		c[4]=new Songs("think about you",3.2,"------");
		c[5]=new Songs("drive that funky soul",3.2,"spidy");
		c[6]=new Songs("nothing left to die",3.2,"john wicks tribute");
		listening(c);
	}
	static void listening(Songs[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.println("song:"+c[i].title+" duration is:"+c[i].duration+" singer:"+c[i].singer);
		}

	}

}
