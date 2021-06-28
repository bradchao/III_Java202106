package tw.brad.java;

public class Brad37 {

	public static void main(String[] args) {
		// Exception 例外, 異常
		int a = 10, b = 3;
		int c;
		
		System.out.println("Start");
		
		try {
			// new 例外的是 jre 可以這樣說？ => JVM, JRE
			c = a / b;
			System.out.println(c);
			
			int[] d = {1,2,3};
			
			System.out.println(d[0]);
			System.out.println(d[2]);
		}catch (ArithmeticException e) {
			// 請問ArithmeticException e是在做宣告嗎 => 是
			System.out.println("XX:" + e.getLocalizedMessage());
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Ooop!");
		}
		
		System.out.println("Game Over");
		
	}

}
