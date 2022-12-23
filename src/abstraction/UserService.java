package abstraction;

import java.io.Serializable;

public interface UserService  extends CommonService,TestService, Serializable{
	
  // int MAX = 500;
    void addUser();
    void deleteUser();
    
    static void sum() {
    	System.out.println("sum");
    }
    
     default void searchUser() {
    	
    }
     
     default void searchUser1() {
     	
     }
}
