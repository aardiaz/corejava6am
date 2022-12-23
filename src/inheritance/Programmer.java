package inheritance;

public class Programmer extends Employee{
	
	String progLang;
	String projectName;
	int bonus;
	
	void print() {
		
		super.print();
		
		System.out.println("P.Language = "+progLang);
		System.out.println("ProjectName = "+projectName);
		System.out.println("Bonus = "+bonus);
	}
	
	public static void main(String[] args) {
		
		Programmer  p1 = new Programmer();
		p1.id = 4499;
		p1.name = "Shiva Ram";
		p1.companyName = "Cotiviti";
		p1.salary = 200000;
		p1.progLang = "Java";
		p1.projectName = "Health Care";
		p1.bonus = 50000;
		
		p1.print();
	}

}
