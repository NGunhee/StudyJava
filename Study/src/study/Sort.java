package study;

public interface Sort {
	
	public void ascedning(int[] a);
	public void descending(int[] b);
	
	
	default void dscription() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}

}
