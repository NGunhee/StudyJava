package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		
	
		try (FileInputStream fis=new FileInputStream("input2.txt")){
			
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
