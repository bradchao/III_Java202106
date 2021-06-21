package tw.brad.java;

public class Brad09 {

	public static void main(String[] args) {
		int a = 10;
		final int b = 11;
		
		switch (a) {	//  byte, short, int, char, String, enum
			case 1:
				System.out.println("A");
				break;
			case 10:
				System.out.println("B1");
				break;
			case b - 2:
				System.out.println("B2");
				break;
			case 100:
				System.out.println("C");
				break;
			default:
				System.out.println("X");
		}
		
		System.out.println("---");
	}

}
