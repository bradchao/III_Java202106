package tw.brad.java;

public class Brad34 {

	public static void main(String[] args) {
		Brad341 obj1 = new Brad341() {
			void m1() {System.out.println("m1()");}
			void m2() {System.out.println("m2()");}
		};
		
		obj1.m1();
		obj1.m2();
	}

}

abstract class Brad341{
	Brad341(){System.out.println("Brad341()");}
	abstract void m1();
	abstract void m2();
}
