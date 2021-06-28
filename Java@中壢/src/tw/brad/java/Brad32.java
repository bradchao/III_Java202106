package tw.brad.java;

public class Brad32 {

	public static void main(String[] args) {
		Brad321 obj1 = new Brad321();
		System.out.println("---");
		Brad322 obj2 = new Brad322();
		System.out.println("---");
		Brad323 obj3 = new Brad323();
		System.out.println("---------------");
		obj1.m1();
		obj2.m1();
		obj3.m1();
		System.out.println("-------------------------------");
		Brad321 obj4 = new Brad322();
		System.out.println("-------------------------------");
		obj4.m1();
		System.out.println("-------------------------------");
		Brad321 obj5 = new Brad323();
		System.out.println("-------------------------------");
		obj5.m1();
		
		
		
	}

}

class Brad321 {
	Brad321(){
		System.out.println("Brad321()");
	}
	void m1() {System.out.println("Brad321:m1()");}
}
class Brad322 extends Brad321 {
	Brad322(){
		// super();
		System.out.println("Brad322()");
	}
	void m1() {
		super.m1();
		System.out.println("Brad322:m1()");
		super.m1();
	}
	void m2() {System.out.println("Brad322:m2()");}
}
class Brad323 extends Brad322 {
	Brad323(){
		// super();
		System.out.println("Brad323()");
	}
	void m1() {System.out.println("Brad323:m1()");}
	void m3() {System.out.println("Brad323:m3()");}
}
