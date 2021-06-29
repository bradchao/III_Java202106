package tw.brad.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Brad44 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/maskdata.csv");
			InputStreamReader isr = new InputStreamReader(fin, Charset.forName("UTF-8"));
			BufferedReader reader = new BufferedReader(isr);
			
			String line; int num = 1;
			while ( (line = reader.readLine()) != null) {
				String[] row = line.split(",");
				if (row[2].contains("中壢")) {
					System.out.println(row[1] + ":" + row[2] + ":" + row[4] + ":" + row[5]);
				}
			}
			
			
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
