package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("��");
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String s = ir.next();
			System.out.println(s);
		}

	}

}
