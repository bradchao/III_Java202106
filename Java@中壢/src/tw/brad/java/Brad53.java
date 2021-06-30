package tw.brad.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import tw.brad.myclasses.Bike;

public class Brad53 {

	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<>();
		
		TreeSet<Integer> set = new TreeSet<>();
		
		while (set.size() < 6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		System.out.println("---");
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int v = it.next();	// Integer => auto-unboxing
			System.out.println(v);
		}
		it = null;
		System.out.println("---");
		
		for (Integer v : set) {
			System.out.println(v);
		}
		
		
	}

}
