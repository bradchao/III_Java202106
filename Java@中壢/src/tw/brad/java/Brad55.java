package tw.brad.java;

import java.util.HashMap;
import java.util.Set;

public class Brad55 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("ID", "100");
		map.put("Name", "銅鑼杭菊美人茶");
		map.put("Feature", "苗栗縣銅鑼地區於民國50年代開始種植杭菊，由中藥材變農村觀光休閒。今花茶系列飲品加入東方美人茶");
		map.put("SalePlace", "苗栗縣銅鑼鄉永樂路22號");
		
		if (map.containsKey("SpecAndPrice")) {
			System.out.println(map.get("SpecAndPrice"));
		}
		System.out.println("----");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		
	}

}
