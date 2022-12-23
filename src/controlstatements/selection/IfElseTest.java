package controlstatements.selection;

public class IfElseTest {
	
	/*
	 * =================== if-else =========================
	 * # if we have to check exactly two options(conditions)
	 * 
	 * syntax :
	 *    
	 *      if(condition){
	 *           //statements
	 *      }else{
	 *         //statements
	 *      }
	 * 
	 */
	
	public static void main(String[] args) {
		
		 int a = 90;
		 int b = 50;
		
		  if(a < b) {
			  System.out.println(a+" is smallest number");
		  }else {
			  System.out.println(b+" is smallest number");
		  }
		  
		  
	}

}
