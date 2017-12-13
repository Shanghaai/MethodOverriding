package org.sahil.MethodOverriding;

public class CarMain 
{
	public static void main(String[] args) {
		Car c = new Car();
		c.move();
		
		System.out.println("************************************************");
		Merscedez m = new Merscedez();
		m.move();
		m.move(500);
	}
}
