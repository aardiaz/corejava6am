package constructor;

public class User {

	// instance variable
	String userName;
	String password;

	// ============= default constructor ===============
	User() {
		userName = "root";
		password = "1234";
	}

	// ================== parameterized constructor =================
	User(String userName, String password) {

		this.userName = userName;
		this.password = password;

		// 'this' keyword represents current object.

	}
	
	User(String userName) {

		this.userName = userName;
	}

	void print() {
		System.out.println("UserName = " + userName);
		System.out.println("Password = " + password);
	}

	public static void main(String[] args) {

		User u  = new User("ram", "r1q2w");
		u.print();
		
		
	//Object obj = new Object();
		
	/*
	 * Class {@code Object} is the root of the class hierarchy.
	 * Every class has {@code Object} as a superclass.
	 * All objects,including arrays, implement the methods of this class.
	 */
		
	}
}
