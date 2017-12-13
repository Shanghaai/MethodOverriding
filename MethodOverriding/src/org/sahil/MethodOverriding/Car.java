package org.sahil.MethodOverriding;

public class Car 
{
	public void move()
	{
		System.out.println("moving with normal speed");
	}
}

class Bmw extends Car
{
	@Override
	public void move() 
	{
		System.out.println("moving with high speed + accuracy");
	}
}	

class Merscedez extends Car
{
	@Override
	public void move() 
	{
		System.out.println("moving high speed + accuracy + advanced Technologies");
	}
	
	public void move(int i) 
	{
		System.out.println("Changing the arguments then wee need to remove @override annotation"+i);
		System.out.println("means that it is not over rided method");
		
	}
}