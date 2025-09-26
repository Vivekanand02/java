/*2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.*/
class AbstractShape{
	public static void main(String[] args){
		Circle circle=new Circle();
		Triangle triangle=new Triangle();
		triangle.calculateArea();
		triangle.calculatePerimeter();
		circle.calculateArea();
		circle.calculatePerimeter();
	}
}
abstract class Shape{
	float radius=50f;
	final float pi=3.14f;
	
	int side1,side2,side3=10;
	
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
class Circle extends Shape{
	public void calculateArea(){
		System.out.println(pi*radius*radius);
	}
	public void calculatePerimeter(){
		System.out.println(2*pi*radius);
	}
}
class Triangle extends Shape{
	public void calculateArea(){
		System.out.println(side1+side2+side3);
	}
	public void calculatePerimeter(){
		System.out.println(1/2*side2*side3);
	}
}
