package exam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example10 {
	public static void main(String[] args) {
		/*
		 * LinkedHashMap
		 * - Map의 순서를 보장하는 자료구조이다 
		 */
		// HashMap과 LinkedHashMap 의 차이 
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Key1", "Value1");
		map1.put("Key2", "Value2");
		map1.put("Key3", "Value3");
		map1.put("Key4", "Value4");
		map1.put("Key5", "Value5");
		
		for(Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("====================");
		LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
		map2.put("Key1", "Value1");
		map2.put("Key2", "Value2");
		map2.put("Key3", "Value3");
		map2.put("Key4", "Value4");
		map2.put("Key5", "Value5");
		
		for(Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
