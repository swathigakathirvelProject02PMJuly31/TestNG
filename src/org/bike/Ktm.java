package org.bike;

public class Ktm implements Bike
{

	@Override
	public void cost() {
		System.out.println("Ktm Bike Cost=1.5l");
		
	}

	@Override
	public void speed() {
		System.out.println("Ktm Bike Speed=120km/hr");
		
	}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
	
}
}
