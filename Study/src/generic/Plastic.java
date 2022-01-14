package generic;

public class Plastic extends Metrial{
	
	public String toString() {
		return "재료는 Plastic 입니다";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("plastic 으로 프린팅합니다.");
	}
}
