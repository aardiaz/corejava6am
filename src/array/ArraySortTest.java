package array;

import java.util.Arrays;

public class ArraySortTest {
	
	
	public static void main(String[] args) {
		
		int data[] = {6,78,4,90,7,6,5,78,90,76,66,5,78,96,5};
		
		Arrays.sort(data);
		
		System.out.println(Arrays.toString(data));
		
//		System.out.println("=====reverse order======");
//		
//		for(int i=data.length-1; i>=0; i--) {
//			System.out.print(data[i]+",");
//		}
		
		//copy array
		
		int array1[] = {6,5,78,9,30,9,8,4,76,57,5,4,35,35,6};
		
		int array2[] =Arrays.copyOf(array1, 4);
		  System.out.println(Arrays.toString(array2));
		
		int[] array3 = Arrays.copyOfRange(array1, 0, 5);
		System.out.println(Arrays.toString(array3));
		
		
		boolean res = Arrays.equals(array2, array3);
		System.out.println(res);
		
		
		//insert values to given range in array
		
		Arrays.fill(array1, 900);
		System.out.println(Arrays.toString(array1));
		
		
		Arrays.fill(array1, 4, 10, 888);
		System.out.println(Arrays.toString(array1));
		
		
	}

}
