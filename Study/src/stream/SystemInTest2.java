package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Է� �� ���̶�� ������");
		
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i= isr.read()) !='��'){
					System.out.print((char)i);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
