package starcraft;

public class Marine extends Unit {
	
	@Override
	public void stop() {
		System.out.println("마린이 정지합니다.");
	}
	
	public void stimPack() {
		System.out.println("스팀팩을 사용하였습니다.");
	}
	

}
