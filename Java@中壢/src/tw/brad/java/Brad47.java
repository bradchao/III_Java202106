package tw.brad.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Brad47 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.bradchao.com/");
			HttpURLConnection conn  = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
