package tw.brad.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad46 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File source = new File("dir1/coffee.jpg");
			BufferedInputStream bin = 
					new BufferedInputStream(new FileInputStream(source));
			long len = source.length();
			byte[] buf = new byte[(int)len];
			bin.read(buf);
			bin.close();
			
			BufferedOutputStream bout = 
				new BufferedOutputStream(new FileOutputStream("dir2/bradv2.jpg"));
			bout.write(buf);
			bout.flush();
			bout.close();
			System.out.println(System.currentTimeMillis() - start);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
