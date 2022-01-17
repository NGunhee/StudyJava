package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferdReaderInputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a[] = new String[3];
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int i=0;i<3;i++) {
			String line=reader.readLine();
			a[i]=line;
		}
		for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}

	}

}
