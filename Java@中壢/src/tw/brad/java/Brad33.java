package tw.brad.java;

public class Brad33 {

	public static void main(String[] args) {
//		Brad331 obj1 = new Brad331();
		Brad331 obj2 = new Brad332();
		obj2.m1();
		obj2.m2();
	}
}

abstract class Brad331 {
	void m1() {System.out.println("Brad331:m1()");}
	abstract void m2();
}
// 多型
class Brad332 extends Brad331 {
	void m2() {System.out.println("Brad332:m2()");}
}
class Brad333 extends Brad331 {
	void m2() {System.out.println("Brad333:m2()");}
}
