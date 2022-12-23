package looping;

public class SumOf100nos {
	
	public static void main(String[] args) {
		
		int sum  = 0;
		
		int start=1;
		int end = 100;
		 
		for(int i=start; i<=end; i++) {
			
			//System.out.println(i);
			if(i%2 == 0) {
				System.out.println(i);
			       sum = sum + i;
			}
		}
		
		System.out.println("Total = "+sum);

		
	}
}
