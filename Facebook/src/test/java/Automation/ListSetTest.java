package Automation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetTest {
	

	public static void main(String[] args) {
		

		List<String> list = new ArrayList<String>();
		
		System.out.println(list.isEmpty());
		
		list.add("UFT");
		list.add("Selenium");
		list.add("LFT");
		list.add("UFT");
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove("LFT");
		System.out.println(list.size());
		
		
		Set<String> set = new HashSet<String>();
		System.out.println(set.isEmpty());
		set.add("Selenium");
		set.add("UFT");
		set.add("LFT");
		set.add("LFT");
		System.out.println(set.size());
		System.out.println(set);
		set.remove("LFT");
		System.out.println(set.size());
		
		for(String str : set) {
			System.out.println(set);
		}
		
		
		
		
	}

}
