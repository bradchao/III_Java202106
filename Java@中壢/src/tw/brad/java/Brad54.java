package tw.brad.java;

import java.util.LinkedList;

public class Brad54 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		addName(list, "Brad");
		addName(list, "Eric");
		addName(list, "Brad");
		addName(list, "Tony");
		addName(list, "Andy");
		
		System.out.println(list.size());
		System.out.println(list);
	}
	
	static void addName(LinkedList<String> list, String name) {
		if (!list.contains(name)) {
			list.add(name);
		}
	}

}
