package abstraction;
/*
 * 2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
 */
public abstract class Shape {
     abstract void calculateArea();
     abstract void calculatePerimeter();
   }
 class Circle extends Shape{
	 void calculateArea()
	 {
		 Double radius=25.2;
		Double pi=3.14;
		 Double area=pi*radius*radius;
		 System.out.println(area);
	 }
		 void calculatePerimeter() 
		 {
			 Double radius=25.2;
			 Double pi=3.14;
			 Double perimeter=2*pi*radius;
				 System.out.println(perimeter);
		}
	 }
  class Triangle extends Shape{
	  void calculateArea()
		 {
		  Double b=2.2,h=5.1;
			 Double area=1/2*b*h;
			 System.out.println(area);
		 }
			 void calculatePerimeter() 
			 {
				 Double x=4.3,y=5.6,z=5.1;
				 Double perimeter=x+y+z;
					 System.out.println(perimeter);
			}
  }
  class Run22{
	  public static void main(String[] args) {
		Shape shape=new Circle();
		shape.calculateArea();
		shape.calculatePerimeter();
		Shape shape2=new Triangle();
		shape2.calculateArea();
		shape2.calculatePerimeter();
	}
  }
   
 
