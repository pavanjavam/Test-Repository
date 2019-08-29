package com.nonstatic;

public class Rider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		System.out.println("Name of vehicle:"+v1.name+"  colour:"+v1.colour+"   speed:"+v1.speed+"km/hr");
		System.out.println("Name of vehicle:"+v2.name+"  colour:"+v2.colour+"   speed:"+v2.speed+"km/hr");
		v1.name="car";
		v1.colour="black";
		v1.speed=240.42;
		
		v2.name="metro";
		v2.colour="silver";
		v2.speed=220.00;
		System.out.println("Name of vehicle:"+v1.name+"   colour:"+v1.colour+"  speed:"+v1.speed+"km/hr");
		System.out.println("Name of vehicle:"+v2.name+" colour:"+v2.colour+" speed:"+v2.speed+"km/hr");
	}

}
