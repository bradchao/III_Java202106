package tw.brad.java;

public class Brad13 {

	public static void main(String[] args) {
		int[] a;
		a = new int[3];	// index => 0 ~ 2
		System.out.println(a.length);
		System.out.println("---");
		System.out.println(a[1]);
		
		a[0] = 123;
		a[1] = 987;
		a[2] = 777;
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
