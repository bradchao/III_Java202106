package tw.brad.java;

import tw.brad.myclasses.MyTest2;

public class Brad26 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj1 == obj3);
		System.out.println(obj1.equals(obj3));
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println("---");
		
		MyTest2 mt1 = new MyTest2(18);
		MyTest2 mt2 = new MyTest2(19);
		
		// 簡單來說 Java不支援operator overloading的原因只是怕編寫程式麻煩而已
		System.out.println(mt1 == mt2);
		System.out.println(mt1.equals(mt2));
		System.out.println("---");
		String s1 = new String("Brad");
		String s2 = new String("Brad");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("----");
		System.out.println(mt2);
		
		
		
		
	}

}
