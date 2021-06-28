package tw.brad.java;

import tw.brad.myclasses.TWId;

public class Brad29 {

	public static void main(String[] args) {
		String a = "abcdefg";
		String b = a.concat("1234567");
		System.out.println(a);
		System.out.println(b);
		System.out.println("----");
		String c = a.replace('a', 'A');
		System.out.println(a);
		System.out.println(c);
		System.out.println("---");
		a = a.toUpperCase();
		System.out.println(a);
		System.out.println("---");
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefg");
		System.out.println(sb);
		sb.append("123").replace(1, 3, "OK");
		System.out.println(sb);
		
	}

}
