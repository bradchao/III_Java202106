package tw.brad.java;

import java.util.Scanner;

public class Brad03 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a = ");
		a = scanner.nextInt();
		
		System.out.print("b = ");
		b = scanner.nextInt();
		
		int c = a + b;
		System.out.println(c);
		
	}

}
