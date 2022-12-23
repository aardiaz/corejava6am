package javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(67,89,7,68,96,8,6,887,65,7,86);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Collections.fill(list, 80);
		System.out.println(list);
		
	}
	

}
