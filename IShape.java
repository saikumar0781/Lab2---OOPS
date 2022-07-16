package great_learning;

public interface IShape
{
	Renderer renderer = new Renderer();
	double area=0.0;
	String colour=null;
	double perimeter=0.0;
	String type=null;
	//methods
	public double calculateArea();
	public double calculatePerimeter();
}