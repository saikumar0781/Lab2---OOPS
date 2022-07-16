package great_learning;

public class Main {
	public static void main(String args[])
	{
		Rectangle rectangle = new Rectangle(12,10,"Red");
		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.calculatePerimeter());
		rectangle.renderer.draw();
		rectangle.renderer.draw("Rectangle");
		
		//Triangle
		Triangle triangle = new Triangle("Blue",12,10);
		System.out.println(triangle.calculateArea());
		System.out.println(triangle.calculatePerimeter());
		rectangle.renderer.draw();
		rectangle.renderer.draw("Triangle");
		
		//Circle
		Circle circle = new Circle(7,"Orange");
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculatePerimeter());
		circle.renderer.draw();
		circle.renderer.draw("Circle");
		
		//Square
		Square square = new Square(10,"Brown");
		System.out.println(square.calculateArea());
		System.out.println(square.calculatePerimeter());
		square.renderer.draw();
		square.renderer.draw("Rectangle");
	}

}
