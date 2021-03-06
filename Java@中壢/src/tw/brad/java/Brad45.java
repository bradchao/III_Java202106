package tw.brad.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad45 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			BufferedInputStream bin = 
					new BufferedInputStream(new FileInputStream("dir1/coffee.jpg"));
			
			BufferedOutputStream bout =
					new BufferedOutputStream(new FileOutputStream("dir2/brad.jpg"));
			
			int b; byte[] buf = new byte[4*1024];
			int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			
			bout.flush();
			bout.close();
			
			bin.close();
			System.out.println(System.currentTimeMillis() - start);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
