package information_ExceptionHandling;

import java.io.FileReader;

public class FileReadert {
	public static void main(String[] args) {
		
		try {
			
			FileReader fileReader = new FileReader("C:\\Users\\Admin\\Desktop\\p.txt");
			try {
				int i;
				while((i=fileReader.read())!=-1)
				{
					System.out.println((char)i);
				}
				
			} finally {
				fileReader.close();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
