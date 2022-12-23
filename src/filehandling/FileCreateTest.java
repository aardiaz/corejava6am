package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateTest {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("e://test.txt");
		
		file.write("Good Morning !!".getBytes());

		file.close();
		System.out.println("success");
	}

}
