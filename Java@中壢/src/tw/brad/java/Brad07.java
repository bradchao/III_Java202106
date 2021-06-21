package tw.brad.java;

import java.util.Scanner;

public class Brad07 {

	public static void main(String[] args) {
		int score;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Score = ");
		score = scanner.nextInt();
		
		if (score >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}
		
		System.out.println("---");
		
	}

}
