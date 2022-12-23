package methodoverriding;

public class Test {

	public static void main(String[] args) {

		// static or early biding or object
		NabilBank nb = new NabilBank();

		nb.getBankName();
		nb.getInterestRate();

		// up-casting
		CentralBank b = new PrabhuBank();
		printBankInfo(b);
		
	}

	//late or dynamic binding of object 
	//also called run time polymorphism
	static void printBankInfo(CentralBank b) {
		b.getBankName();
		b.getInterestRate();
	}
	 

}
