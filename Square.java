package great_learning;

public class Square extends Rectangle{
	public Square(int side, String colour)
	{
		super(side,side,colour);
	}
	public double calculateArea()
	{
		return length*width;
	}
	public double calculatePerimeter()
	{
		return 4*this.length;
	}
	

}
