package stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter((new FileWriter("writerex.txt")));
		writer.append("test");
		writer.flush();
		writer.append("bufferedWriter");
		writer.flush();
		writer.close();
	}

}
