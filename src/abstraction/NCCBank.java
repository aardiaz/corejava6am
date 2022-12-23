package abstraction;

public class NCCBank  extends CentralBank{

	@Override
	protected void getBankName() {
		
		System.out.println("NCC Bank");
	}
	
	@Override
	protected void getInterestRate() {
		 
		 System.out.println("15%");
	}
}
