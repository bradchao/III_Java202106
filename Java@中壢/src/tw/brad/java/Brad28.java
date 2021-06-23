package tw.brad.java;

public class Brad28 {

	public static void main(String[] args) {
		// 1. 長度 = 10
		// 2. (1) A-Z
		// 3. (2) 1 , 2
		// 4. (3-10) 0 - 9
		//-----------------------
		// 0912-123456
		String id = "A123456789";
		if (id.matches("[A-Z][12][0-9]{8}")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		
	}

}
