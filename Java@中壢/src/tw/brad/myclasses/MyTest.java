package tw.brad.myclasses;

public class MyTest {
	private MyTest() {
		System.out.println("MyTest()");
	}
	public static MyTest getMyTest() {
		return new MyTest();
	}
	public void m1() {
		System.out.println("MyTest:m1()");
	}
}
