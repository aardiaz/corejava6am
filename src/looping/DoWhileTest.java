package looping;

public class DoWhileTest {
	/*
	 * ========== do-while loop ==========
	 *   
	 *    syntax :
	 *    
	 *    do{
	 *    
	 *         //statements
	 *        
	 *        //inc/dec
	 *    
	 *    }while(condition);
	 */
	
	public static void main(String[] args) {
		
		/*
		 *   9 * 1 = 9
		 *   9 * 2 = 18
		 *   ............
		 *   .............
		 *   9 * 10 = 90
		 */
		
		int n = 54675;
		int i = 1;
		
		do {
			
			System.out.println(n+" x "+ i +" = "+(n*i) );
			
			i++;
		}while(i <= 10);
		
		
		
	}

}
