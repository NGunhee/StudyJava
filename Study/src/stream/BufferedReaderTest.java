package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("bufferedreader.txt"));
		
		String line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
	}

}
