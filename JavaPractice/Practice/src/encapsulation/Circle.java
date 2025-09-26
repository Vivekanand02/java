package encapsulation;

public class Circle {
	
	private Float radius;
	
	public void setRadius(Float radius) {
		this.radius=radius;
	}
	public Float getRadius() {
		return radius;
	}
	public void calculateArea(Float radius) {
		Double area=3.14*radius*radius;
		System.out.println(area);
	}
	public void calculatePerimeter(Float radius) {
		Double perimeter=2*3.14*radius;
		System.out.println(perimeter);
	}
	class Run{
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.setRadius(42.25f);
		System.out.println(circle.getRadius());
		circle.calculateArea(circle.getRadius());
		circle.calculatePerimeter(circle.getRadius());
	}

}
}
