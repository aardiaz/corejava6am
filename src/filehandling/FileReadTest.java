package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTest {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("d://userloginfo.log");
		BufferedInputStream  buffer = new BufferedInputStream(file);
		
		int data;
		while((data=buffer.read()) != -1) {
			
			  System.out.print((char)data);
		}
		
		
		
	}

}
