package tw.brad.java;

import java.io.File;

public class Brad39 {

	public static void main(String[] args) {
		
		File f1 = new File("dir2/dir3/dir4/dir5/dir6");
		if (f1.exists()) {
			System.out.println("OK:" + f1.getAbsolutePath());
		}else {
			System.out.println("XX");
			if (f1.mkdirs()) {
				System.out.println("create success");
			}else {
				System.out.println("create failure");
			}
		}
		
	}

}
