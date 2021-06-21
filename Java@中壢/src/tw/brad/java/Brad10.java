package tw.brad.java;

import java.util.Scanner;

public class Brad10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Month = ");
		int month = scanner.nextInt();
		int days = 0;
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days = 31;
				break;
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
		}
		
		System.out.println(String.format("%d月有%d天", month, days));
		
		
	}

}
