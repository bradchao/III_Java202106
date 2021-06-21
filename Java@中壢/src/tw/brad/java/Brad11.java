package tw.brad.java;

public class Brad11 {

	public static void main(String[] args) {
		
		int i = 0;
		for (m1() ; i < 10 ; m2()) { 
			System.out.println("Hello, World" + i++);
		}
		//System.out.println("---");
		//System.out.println(i);
		
	}
	
	static void m1() {
		System.out.println("Brad");
	}
	static void m2() {
		System.out.println("-----");
	}

}
