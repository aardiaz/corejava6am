package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter  file = new FileWriter("d://product.txt",true);
		
		file.write("Id = 555\n");
		file.write("Name = Laptop\n");
		file.write("Company = DEll\n");
		file.write("Price = 150000\n");
		file.write("Quantity = 90\n");
		
		file.close();
		System.out.println("success");
	}

}
