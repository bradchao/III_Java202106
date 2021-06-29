package tw.brad.java;

import java.io.FileWriter;
import java.io.IOException;

public class Brad43 {

	public static void main(String[] args) {
		// 老師 請問如果要read的資料不是UTF-8編碼，
		// 我們是要在properties將Eclipse的預設編碼改掉，
		// 還是有其他方法可以解決呢? 謝謝!
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
