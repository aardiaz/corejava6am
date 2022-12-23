package array;

public class ArrayWithMethod {
	/*
	 * ================= Array With Method =============
	 * a> array as argument:
	 * 
	 *       void sum(int a[]){
	 *           
	 *           
	 *       }
	 *       
	 *       sum(array);
	 * 
	 * b> array as return type:
	 * 
	 *      int[] getValue(){
	 *      
	 *      //10,45,456,667,22,343,3454,.........300th
	 *      
	 *       return array;
	 *      }
	 */
	
	public static void main(String[] args) {
		
		int data[] = {9,87,6,5,43,21,234,5,67,86,54,1,345,67,865,43};
		sum(data);
		findSmallestValue(data);
		
		//create array of 5 subject name
		String[]  subjects = {"English","Nepali","Math","Computer"};
		printSubject(subjects);
		
	}
	
	//create printSubject() method to print array of subject.
	static void printSubject(String[] subjects) {
		
		for(String s : subjects) {
			System.out.println(s);
		}
	}
	
	
	//array as argument
	static void sum(int values[]) {
		
		int sum = 0;
		
		for(int x : values) {
			sum = sum + x;
		}
		
		System.out.println("Total = "+sum);
	}

	//
	static  void findSmallestValue(int array[]) {
		  
		  int sv = array[0];
		  
		  for(int x : array) 
			   if(sv > x)
				   sv = x;
		  
		  System.out.println("Smallest Value = "+sv);
	  }
	
	
	
	
	
}






