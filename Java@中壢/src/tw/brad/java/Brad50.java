package tw.brad.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad50 {

	public static void main(String[] args) {
		// POST
		try {
			URL url = new URL("https://pdfmyurl.com/");
			
			byte[] postData = "url=http://www.gamer.com.tw".getBytes();
			int dataLength = postData.length;
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
			conn.setRequestProperty("charset", "utf-8");
			conn.setRequestProperty("Content-Length", Integer.toString(dataLength));
			conn.setUseCaches(false);
			
			DataOutputStream dout = new DataOutputStream(conn.getOutputStream());
			dout.write(postData);
			dout.flush();

			//----------------------------------------------------
			BufferedInputStream bin =
				new BufferedInputStream(conn.getInputStream());
			
			BufferedOutputStream bout =
				new BufferedOutputStream(new FileOutputStream("dir2/brad3.pdf"));
			
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
