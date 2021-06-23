package tw.brad.mytest;

import tw.brad.myclasses.Bike;

public class Scooter extends Bike{

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.8;
	}
	
	

}
