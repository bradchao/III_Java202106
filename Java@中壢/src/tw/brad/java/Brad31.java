package tw.brad.java;

import tw.brad.myclasses.TWId;

public class Brad31 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(3);
		TWId id4 = new TWId(true, 7);
		TWId id5 = TWId.createTWIdFromString("A12345678");
		
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id3);
		System.out.println(id4);
		System.out.println(id5);
		
		System.out.println("---");

	}

}
