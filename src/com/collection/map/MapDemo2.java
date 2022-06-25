package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("suresh ",  "9874512456");
		map.put("akash  ",   "7845126235");
		map.put("suraJ  ",   "7945856215");
		map.put("kailash", "7854695212");
		
		Set<String> key=map.keySet();
		
		for(String s:key) {
			System.out.println(s+" "+map.get(s));
		}
		
		
		
		
	}

}
