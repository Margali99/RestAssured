package Automation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
	
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("UserName", "Admin");
		map.put("Password", "Admin123");
		map.put("FirstName", "Srikrishna");
		map.put("LastName", "A");
		
		
		System.out.println(map.get("UserName"));
		map.remove("LastName");
		
		//to retrieve Keys
		
		Set<String> key = map.keySet();
		
		for(String str : key) {
			System.out.println(str);
			
		}
		
		Collection<String> values = map.values();
		
		for(String str : values) {
			System.out.println(str);
		}
		
		
		
	}

}
