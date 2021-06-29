package tw.brad.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad45 {

	public static void main(String[] args) {
		try {
			BufferedInputStream bin = 
					new BufferedInputStream(new FileInputStream("dir1/coffee.jpg"));
			
			BufferedOutputStream bout =
					new BufferedOutputStream(new FileOutputStream("dir2/brad.jpg"));
			
			int b;
			while ( (b = bin.read()) != -1) {
				bout.write(b);
			}
			
			bout.flush();
			bout.close();
			
			bin.close();
			System.out.println("OK");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
