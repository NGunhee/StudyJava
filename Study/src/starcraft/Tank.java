package starcraft;

public class Tank extends Unit {
	
	@Override
	public void stop() {
		System.out.println("탱크가 정지합니다.");
	}
	public void changeMode(){
		System.out.println("공격모드를 변환합니다.");
	}

}
