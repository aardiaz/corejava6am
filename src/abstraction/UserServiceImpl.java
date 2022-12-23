package abstraction;

public class UserServiceImpl extends CentralBank implements UserService  {

	@Override
	public void addUser() {
		 
		System.out.println("added success");
	}

	@Override
	public void deleteUser() {
		
		System.out.println("deleted success");
	}

	@Override
	public void print() {
		
		System.out.println("data printed");
	}

	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void getInterestRate() {
		// TODO Auto-generated method stub
		
	}

}
