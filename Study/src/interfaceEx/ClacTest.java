package interfaceEx;

public class ClacTest {

	public static void main(String[] args) {
		CompleteCalc cc = new CompleteCalc();
		int n1=10;
		int n2=2;
		String s1="�ȳ�";
		String s2="�ϼ���";
		System.out.println(cc.add(n1, n2));
		System.out.println(cc.substract(n1, n2));
		System.out.println(cc.times(n1, n2));
		System.out.println(cc.divide(n1, n2));
		System.out.println(cc.stringAdd(s1, s2));
		cc.showInfo();

	}

}
