package tw.brad.java;

public class Brad19 {

	public static void main(String[] args) {
		// 1 + 2 + ... + n =?
		// 
		int n = 5487;
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i++;
		}
		System.out.println(String.format("1 + 2 + ... + %d = %d", n, sum));
	}

}
