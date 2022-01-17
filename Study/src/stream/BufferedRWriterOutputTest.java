package stream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedRWriterOutputTest {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.append("test");
		writer.append("BufferedWriter");
		writer.close();

	}

}
