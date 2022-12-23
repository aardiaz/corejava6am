package objectwithmethod;

public class Test {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Product x = t.getProduct();
		t.printProduct(x);
	}
	//object as arguments
	void printProduct(Product p) {
		
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getCompany());
	}
	
	//object as return type 
	Product getProduct() {
		
		Product prod = new Product();
		
		prod.setId(8900);
		prod.setName("TV");
		prod.setPrice(80000);
		prod.setCompany("Samsung");
		
		return prod;
	}

}


