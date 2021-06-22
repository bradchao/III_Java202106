package tw.brad.java;

import tw.brad.myclasses.Bike;
import tw.brad.myclasses.Scooter;

public class Brad20 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		System.out.println("myBike:" + myBike.getSpeed());
		System.out.println("urBike:" + urBike.getSpeed());
		
		for (int i=0; i<10; i++) myBike.upSpeed();
		System.out.println("myBike:" + myBike.getSpeed());
		System.out.println("---");
		Scooter s1 = new Scooter();
		s1.upSpeed();
		s1.upSpeed();s1.upSpeed();s1.upSpeed();
		s1.downSpeed();
		System.out.println(s1.getSpeed());
		
		
	}

}
