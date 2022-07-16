package great_learning;

public class Rectangle implements IShape{
	int length;
	int width;
	String colour;
	public Rectangle(int length,int width,String colour)
	{
		this.length=length;
		this.width=width;
		this.colour= colour;
	}
	public double calculateArea()
	{
		return this.length*this.width;
	}
	public double calculatePerimeter()
	{
		return 2*(this.length+this.width);
	}
}
