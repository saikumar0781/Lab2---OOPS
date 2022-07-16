package great_learning;

public class Triangle implements IShape{
	 public static final double PI=3.14;
	String colour=null;
	int base=0;
	int height=0;
	
	public Triangle(String colour,int height, int base)
	{
		this.colour= colour;
		this.height=height;
		this.base= base;
	}
	public double calculateArea()
	{
		return 1/2*(this.base*this.height);
	}
	public double calculatePerimeter()
	{
		return (this.height+this.base+Math.sqrt(this.base*this.base + this.height*this.height));
	}

}
