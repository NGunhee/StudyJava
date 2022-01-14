package starcraft;

public class Dropship extends Unit{
	
	@Override
	public void stop() {
		System.out.println("드랍쉽이 정지합니다.");
	}
	public void load() {
		System.out.println("유닛을 태웁니다.");
	}
	public void unload() {
		System.out.println("유닛을 내립니다.");
	}

}
