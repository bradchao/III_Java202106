package tw.brad.java;

import tw.brad.myclasses.Scooter;

public class Brad21 {

	public static void main(String[] args) {
		Scooter s1 = new Scooter();
		System.out.println(s1.getGear());
		s1.setGear(1);
		System.out.println(s1.getGear());
		s1.setGear(3);
		System.out.println(s1.getGear());
	}

}
