package tw.brad.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad48 {

	public static void main(String[] args) {
		// GET
		try {
			URL url = new URL("https://pdfmyurl.com/?url=" + "http://www.gamer.com.tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedInputStream bin =
				new BufferedInputStream(conn.getInputStream());
			
			BufferedOutputStream bout =
				new BufferedOutputStream(new FileOutputStream("dir2/brad.pdf"));
			
			byte[] buf = new byte[4*1024]; int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			
			bout.flush();
			bout.close();
			
			bin.close();
			
			System.out.println("Download OK2");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
