package tw.brad.java;

import java.util.Scanner;

public class Brad07 {

	public static void main(String[] args) {
		int score;
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Score = ");
//		score = scanner.nextInt();
		

		// 亂數產生 0 - 100 的整數成績值 101個值
		score = (int)(Math.random()*101);
		System.out.println(score);
		
		if (score >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}
		
		System.out.println("---");
		
	}

}
