package tw.brad.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Brad41 {

	public static void main(String[] args) {
		
		try {
			// 這裡是一個一個字元讀取？ => X => 一個 byte
			// 應該可以讀line => FileInputStream X
			// Java => 單點 => 套餐
			// 資策會
			// 2^16 => 65536 常用字, 2^24
			// 以問一下編碼方式是設定在環境還是程式碼
			// 當初我們設utf8是設定output預設編碼方式？
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			
			int c; byte[] buf = new byte[3];
			int len;
			while ( (len = fin.read(buf)) != -1) {
				System.out.print(new String(buf));
			}

//			while (fin.available()>0) {
//				c = fin.read();
//				System.out.print((char)c);
//			}
			
			fin.close();
			//System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
