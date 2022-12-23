package abstraction;

public class Test {

	public static void main(String[] args) {
		
		//abstract class
		CentralBank  b = new NabilBank();
		b.getBankName();
		b.getInterestRate();
		
		
		//interface
		UserService us = new UserServiceImpl();
		
		us.addUser();
		us.deleteUser();
		us.print();
		
//		CommonService cs = new UserServiceImpl();
//		cs.print();
		
	}
}
