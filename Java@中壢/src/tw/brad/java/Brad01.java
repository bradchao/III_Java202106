package tw.brad.java;

public class Brad01 {

	public static void main(String[] args) {
		// 強型別 vs 弱型別 => 宣告先, 型別不變
		// [a-zA-Z$_][a-zA-Z0-9$_]*
		byte var1 = 1;
		byte var2 = 127;
		byte var3, var4, var5;
		byte var6 = 123, var7, var8 = 100;
		
		System.out.println(var2);
		System.out.println("------");
		int newvar1  = var1 + var2;	// byte, short, int => int
		System.out.println(var2);
		
		
		
	}

}
