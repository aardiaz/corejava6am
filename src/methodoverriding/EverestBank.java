package methodoverriding;

public class EverestBank extends CentralBank {

	  @Override
	protected void getBankName() {
		System.out.println("Everest Bank");
	}
	  
	  @Override
	protected void getInterestRate() {
		 System.out.println("10%");
	}
}
