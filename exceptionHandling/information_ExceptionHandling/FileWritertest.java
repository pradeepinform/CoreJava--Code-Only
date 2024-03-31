package information_ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritertest {

	public static void main(String[] args)  {
		
		//FileWriter fileWriter= new FileWriter("C:\\Users\\Admin\\Desktop\\p.txt");
	
		try {
			FileWriter fileWriter= new FileWriter("C:\\\\Users\\\\Admin\\\\Desktop\\\\p.txt");
		
		try {
			fileWriter.write("Java programming is the best Language...");
		} finally {
			fileWriter.close();
		}
		System.out.println("Successfully Data Wrote in File");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
