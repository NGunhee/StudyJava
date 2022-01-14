package starcraft;

public class Unit {
	public int x, y;
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void stop() {
		System.out.println("정지합니다.");
	}

}
