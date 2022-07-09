package great_learning;
import java.util.Scanner;
class Shape{
	double Area;
	String color;
	double perimeter;
	String type;
	public double calculateArea(int s)
	{
		return Area;
	}
	public double calculatePerimeter()
	{
		return perimeter;
	}
	public void drawShape()
	{
		System.out.println("Shape is drawn");
	}
}
class Rectangle extends Shape
{
	int height;
	int width;
	double perimeter;
	String type;
	public Rectangle(int height, int width,String type)
	{
		this.height = height;
		this.width = width;
		this.type = type;
	}
	public double calculateArea()
	{
		double Area = height * width;
		return Area;
	}
	public double calculatePerimeter()
	{
		perimeter = 2 * (height + width);
		return perimeter;
	}
	public void drawShape()
	{
		System.out.println("This is rectangle");
	}
	public void showDetails()
	{
		System.out.println("The height = "+ height);
		System.out.println("The width = "+ width);
		System.out.println("The Perimeter = "+ perimeter);
		System.out.println("The type is "+ type);
		
	}
}

class Square extends Shape
{
	int side;
	
	public Square(int side)
	{
		this.side = side;
	}
	public double calculateArea()
	{
		double Area = side * side;
		return Area;
	}
	public double calculatePerimeter()
	{
		double perimeter = 4 * side;
		return perimeter;
	}
	public void drawShape()
	{
		System.out.println("This is square");
	}
	public void showDetails()
	{
		System.out.println("The side is "+side);
	}
}

class Circle extends Shape
{
	double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double calculateArea()
	{
		double Area = Math.PI *Math.pow(radius,2); 
		return Area;
	}
	public double calculatePerimeter()
	{
		double Perimeter = 2 * Math.PI * radius;
		return Perimeter;
	}
	public void drawShape()
	{
		System.out.println("This is circle");
	}
	public void showDetails()
	{
		System.out.println("The radius is "+ radius);
	}
}
public class sai {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle(s.nextInt(),s.nextInt(),s.next());
		System.out.println("The area is "+ r.calculateArea());
		System.out.println("The perimeter is "+r.calculatePerimeter());
		 r.drawShape();
		r.showDetails();
		//square shape
		Square sq = new Square(s.nextInt());
		System.out.println("The area is "+ sq.calculateArea());
		System.out.println("The perimeter is "+sq.calculatePerimeter());
		sq.drawShape();
		sq.showDetails();
		Circle c = new Circle(s.nextDouble());
		System.out.println("The area is "+ c.calculateArea());
		System.out.println("The perimeter is "+c.calculatePerimeter());
		c.drawShape();
		c.showDetails();
		s.close();
	}
}
