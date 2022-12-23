package array;

import java.util.Arrays;

public class ArrayAsReturnTypes {
	
	public static void main(String[] args) {
		
		 int[]  data = getArray();
		 System.out.println(Arrays.toString(data));
		 
		 System.out.println(Arrays.toString(getCities()));
		 System.out.println(Arrays.toString(getOddNumsFrom1to100()));
	}
	
	//array as return type
	static int[] getArray() {
		
		int values[] = {9,87,654,3,56,78,345,6,5,46,78};
		
		return values;
	}
	
	static String[] getCities() {
		
		String[] cities = {"Ktm","Pokhara","Delhi","Dang","Dharan"};
		
		return cities;
	}
    
	
	 static int[] getOddNumsFrom1to100() {
		  
		  int oddnos[] = new int[50];
		  int j = 0;
		  
		  for(int i=1; i<=100; i++) {
			  
			    if(i%2 != 0) {
			    	
			    	oddnos[j] = i;
			    	j++;
			    }
		  }
		  
		  return oddnos;
	  }
	
}





