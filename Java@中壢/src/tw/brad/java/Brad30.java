package tw.brad.java;

import tw.brad.myclasses.TWId;

public class Brad30 {

	public static void main(String[] args) {
		TWId id1 = new TWId();
		TWId id2 = new TWId(false);
		TWId id3 = new TWId(3);
		TWId id4 = new TWId(true, 7);
		
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id3);
		System.out.println(id4);
		
		System.out.println("---");
		int r = fxy(2,3);
		System.out.println(r);
		System.out.println("----");
		
		Brad301 obj1 = new Brad301();
		System.out.println("b = " + Brad301.b);
		
		Brad301 obj2 = new Brad301();
		System.out.println("b = " + Brad301.b);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println("----");
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("123456789012345");
		System.out.println(sb.capacity());
		sb.append("6");
		System.out.println(sb.capacity());
		sb.append("7");
		System.out.println(sb.capacity());
		
		
		
	}
	
	// f(x, y) = 2 x + y
	static int fxy(int x, int y) {
		return 2*x + y;
	}

}

class Brad301 {
	int a;
	static int b;
	
	Brad301(){
		a++;
		b++;
	}
}
