package mystudy;

class Circle{
	public double radius;
	
	public static double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
}

class Cylinder{
	
	Circle circle;
	public double height;
	public Cylinder(Circle c , double height) {
		
		this.circle=c;
		this.height=height;
	}
	
	
	
	public double getVolume() {
		return circle.getArea()*height;
	}
	
}
public class Ex2 {

	public static void main(String[] args) {
		Circle c= new Circle(2.8);
		Cylinder cy = new Cylinder(c, 5.8);
		Cylinder cd=new Cylinder(new Circle(2.8), 5.8);
		System.out.println(cy.getVolume());
		System.out.println(cd.getVolume());

	}

}
