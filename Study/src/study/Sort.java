package study;

public interface Sort {
	
	public void ascedning(int[] a);
	public void descending(int[] b);
	
	
	default void dscription() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}

}
