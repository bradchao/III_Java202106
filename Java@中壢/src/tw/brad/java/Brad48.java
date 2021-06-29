package tw.brad.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad48 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/4KqzPLrDlNZlyw1lJ2L9kQ--/YXBwaWQ9aGlnaGxhbmRlcjt3PTk2MDtoPTY3OS4yO2NmPXdlYnA-/https://s.yimg.com/os/creatr-uploaded-images/2021-06/0feff350-d8a1-11eb-bf33-54dbdb2d0e3f");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedInputStream bin =
				new BufferedInputStream(conn.getInputStream());
			
			BufferedOutputStream bout =
				new BufferedOutputStream(new FileOutputStream("dir2/news.jpg"));
			
			byte[] buf = new byte[4*1024]; int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			
			bout.flush();
			bout.close();
			
			bin.close();
			
			System.out.println("Download OK");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
