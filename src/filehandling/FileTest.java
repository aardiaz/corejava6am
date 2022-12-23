package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;

public class FileTest {

	  public static void main(String[] args) throws IOException {
		
		  File  file = new File("d://product.txt");
		  
		  
		  System.out.println(file.isDirectory());
		  System.out.println(file.exists());
		  
		  File dir = new File("d://java6am");
		  //create folder
		  dir.mkdir();
		  
		  //get all file name from folder
		String[] fnames= dir.list();  
        System.out.println(Arrays.toString(fnames));
        List<String>  namelist= Arrays.asList(fnames);
		System.out.println(namelist.contains("customer.txt"));
		
		//get all files from folder
		File[] files = dir.listFiles();
		
		for(File fl : files) {
			
//			FileReader  nfile = new FileReader(fl.getAbsolutePath());
//			BufferedReader  buffer = new BufferedReader(nfile);
//			String line;
//			while((line=buffer.readLine()) != null) {
//				System.out.println(line);
//			}
			System.out.println(Files.readAllLines(Path.of(fl.getAbsolutePath())));
		
		}
		
		
		
		
	}
}
