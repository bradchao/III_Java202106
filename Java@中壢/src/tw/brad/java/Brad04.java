package tw.brad.java;

public class Brad04 {

	public static void main(String[] args) {
		int a = 10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println("---");
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println("---");
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println("---");
		b += 123;
		System.out.println(b);
	}

}
