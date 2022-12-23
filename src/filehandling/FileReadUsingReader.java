package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadUsingReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader  file = new FileReader("d://emp.csv");
		BufferedReader  buffer = new BufferedReader(file);
		
		String line;
		buffer.readLine();
		
		while((line= buffer.readLine()) != null) {
			//System.out.println(line);
			
			String[]   words = line.split(",");
			System.out.println(words[2]);
			
			//insert these data in db
			
		}
		
		buffer.close();
		file.close();
		
		
	}

}
