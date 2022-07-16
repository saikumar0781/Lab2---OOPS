package great_learning;

public class Circle implements IShape{
	public final double PI=3.14;
	int radius;
	String colour;
	
	public Circle(int radius,String colour)
	{
		this.radius= radius;
		this.colour= colour;
	}

	public double calculateArea()
	{
		return PI*this.radius*this.radius;
	}
	public double calculatePerimeter()
	{
		return 2*PI*this.radius;
	}
}
