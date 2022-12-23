package encapsulation;

public class Test {

	public static void main(String[] args) {

		Customer c = new Customer();

		c.setId(8888);
		c.setName("Pawan Lama");
		c.setAge(40);
		c.setCity("Kathmandu");
		c.setPhone("983446346366");
		
		System.out.println(c);

//		System.out.println("Id = " + c.getId());
//		System.out.println("Name = " + c.getName());
//		System.out.println("Age = " + c.getAge());
//		System.out.println("City = " + c.getCity());
//		System.out.println("Phone = " + c.getPhone());
		
		
	}

}
