package tw.brad.java;

import tw.brad.myclasses.Bike;

public class Brad25 {

	public static void main(String[] args) {
		// String 物件
		// 有方法可以證明只有一個String物件嗎
		// s1  == s2不是只是比較他們的值一樣 但不代表位址一樣 還是我有什麼誤解謝謝
		// 被referenced的值 => 參考 => 參考值
		// 所以我理解 == 在基本型別和物件型別的定義其實不一樣
		// 基本型別看值 物件型別看值 => 位址
		// 值 == 值
		// 話說如果我定義複數型別用 == 會完蛋欸 除非可以overloading重新定義比較值
		// 複數型別? 自定義的 1+2i

		char c1 = "Brad".charAt(0);
		System.out.println(c1);
		
		String s1 = "Brad";
		String s2 = "Brad";
		
		System.out.println(s1 == s2);
		
		int a = 10, b = 20;
		System.out.println(a == b);
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1 == b2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("---");
		System.out.println(s1);
		System.out.println(s2);
		
		// 其實我想問的只是能否重新定義 == 這件事而已,因為C++的類別是可以重新定義運算符的
		// 等一下來玩
		// 不過Java好像不支援運算符重載

		
	}

}
