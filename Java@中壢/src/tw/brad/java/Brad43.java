package tw.brad.java;

import java.io.FileWriter;
import java.io.IOException;

public class Brad43 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("dir1/file2.txt");
			writer.write("Hello, 中壢資策會");
			writer.close();
			System.out.println("OK");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
