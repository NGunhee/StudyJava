package study;

import java.io.IOException;



public class SortTest {

	public static void main(String[] args) throws IOException {
		
		int a[] = new int[10];
		Sort sort =null;
		
		int ch= System.in.read();
		
		if(ch=='A') {
			sort=new QuickSort();
			sort.ascedning(a);
			sort.descending(a);
			sort.dscription();
		}
		else if(ch=='B') {
			sort = new BubbleSort();
			sort.ascedning(a);
			sort.descending(a);
			sort.dscription();
		}
		else if(ch=='H') {
			sort=new HeapSort();
			sort.ascedning(a);
			sort.descending(a);
			sort.dscription();
		}
		else {
			System.out.println("입력오류");
		}
		
		
		
		

	}

}
