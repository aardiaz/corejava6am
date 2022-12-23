package controlstatements.selection;

public class NestedTest {
	/*
	 *   ================= nested if-else ==================
	 *   
	 *    if(condition-1){
	 *    
	 *              if(condition-2){
	 *              
	 *                     if(condition-3){
	 *                     ........................
	 *                     ....................
	 *                     ......................
	 *                     }else{
	 *                     
	 *                     }
	 *              
	 *              }else{
	 *              
	 *              }
	 *    
	 *    }else{
	 *    
	 *    }
	 */
	
	  public static void main(String[] args) {
		
		   String citizen = "indian";
		   int age = 60;
		   
		   
		   
		   if(citizen.equals("nepali")) {
			   
			      if(age >= 18) {
			    	  
			    	  System.out.println("you can vote");
			    	  
			      }else {
			    	  System.out.println("You are under age");
			      }
			      
			   
		   }else {
			   
			   System.out.println("invalid citizenship ");
		   }
		   
		   
		   
		   
		   
		   
		  
	}

}







