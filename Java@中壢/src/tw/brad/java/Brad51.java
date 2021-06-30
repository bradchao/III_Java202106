package tw.brad.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad51 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			HttpURLConnection conn  = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				//System.out.println(line);
				sb.append(line);
			}
			reader.close();
			System.out.println("data ok");
			
			parseData(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void parseData(String json) {
		JSONArray root = new JSONArray(json);
		for (int i=0; i<root.length(); i++) {
			JSONObject row = root.getJSONObject(i);
			String name = row.getString("Name");
			String tel = row.getString("Tel");
			System.out.println(name + ":" + tel);
		}
	}
	
	

}
