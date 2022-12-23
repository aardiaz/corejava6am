package javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		Integer[] data = {6,57,897,65,789,76,52,34,2,4,7,384,63,74};
		
		List<Integer>  list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(data));
		System.out.println(list1);
		
		
	//	List<String>  list = new ArrayList<>();
		List<String>  list = new LinkedList<>();

		list.add("Nepal");
		list.add("China");
		list.add("Canada");
		list.add("Korea");
		
		//list.clear();
		//list.remove(2);
		//list.remove("China");
		
		System.out.println(list.contains("China"));

//		for(String s : list) {
//			System.out.println(s);
//		}
		
		list.forEach(k -> System.out.println(k));
		
		System.out.println(list);
		
	}

}
