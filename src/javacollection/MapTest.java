package javacollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
	//	Map<String, Integer>  hmap = new HashMap<>();
	//	Map<String, Integer>  hmap = new TreeMap<>();
		Map<String, Integer>  hmap = new LinkedHashMap<>();
		
		hmap.put("ram", 90);
		hmap.put("hari", 78);
		hmap.put("anup", 98);
		hmap.put("radha", 65);
		hmap.put("aardi", 89);
		
		for(String key : hmap.keySet()) {
			System.out.println(key+" = "+hmap.get(key));
		}
		
		
	  Map<String, List<String>> tsmap = new HashMap<>();
	  
	  tsmap.put("Hari sir", Arrays.asList(new String[] {"asr","ppp","kkk","yyyy"}));
	  tsmap.put("Ram sir", Arrays.asList(new String[] {"vvvv","MMM","TTT","WWWW","UUU","FFF"}));
		
	  for(String key : tsmap.keySet()) {
		  
		 List<String> slist =  tsmap.get(key);
		 System.out.println(key+" = "+slist);
		  
	  }
	  
	  
	  
	  
	  
		
	}

}
