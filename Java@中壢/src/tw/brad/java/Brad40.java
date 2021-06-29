package tw.brad.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad40 {

	public static void main(String[] args) {
		// Unix \n; Windows \r\n
		String data = "Hello, World\n1234567\n7654321\nabcdefg";
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt");
			fout.write(data.getBytes());
			fout.close();
			System.out.println("OK");
		}catch (Exception e) {
			//System.out.println(e);
		}
		System.out.println("End");
	}

}
