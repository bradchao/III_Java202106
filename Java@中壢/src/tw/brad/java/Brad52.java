package tw.brad.java;

import java.util.HashSet;

import tw.brad.myclasses.Bike;

public class Brad52 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		set.add(new Bike());
		set.add(123);	// auto-boxing 123 => int => Integer Object
		set.add(12.3);
		set.add("Brad");
		set.add(123);
		System.out.println(set.size());
		System.out.println(set);
		
		
	}

}
