package tw.brad.myclasses;

public class TWId {
	private String id;
	
	public TWId() {}
	public TWId(boolean isMale) {}
	public TWId(int area) {}
	public TWId(boolean isMale, int area) {}

//	private TWId(String id) {
//		
//	}
	
	public static boolean isRightTWId(String id) {
		// 第一碼為英文 二到十碼為數字
		// 第二碼必須為1或2
		// 10碼
		// A234567890
		boolean ret = false;
		if (id.length() == 10) {
			String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char c1 = id.charAt(0);
			if (letters.indexOf(c1)>=0) {
				char c2 = id.charAt(1);
				if (c2 == '1' || c2 == '2') {
					ret = true;
					
				}
			}
		}
		
		return ret;
	}
	
	@Override
	public String toString() {
		return id;
	}
}
