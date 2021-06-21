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
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >=80) {
			System.out.println("B");
		}else if (score >=70) {
			System.out.println("C");
		}else if (score >=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
		System.out.println("---");
		
	}

}
