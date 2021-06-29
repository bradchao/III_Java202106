package tw.brad.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad40 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt");
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
