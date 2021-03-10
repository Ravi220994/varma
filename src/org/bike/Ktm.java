package org.bike;
//interface //child

public class Ktm implements Bike {

	public static void main(String[] args) {
		Ktm c=new Ktm();
		c.cost();
		c.speed();
		
	}

	@Override
	public void cost() {
		System.out.println("On Road Price 2.2L");
		
		
	}

	@Override
	public void speed() {
		System.out.println("Maximum Speed :160kmph");
	}

}
