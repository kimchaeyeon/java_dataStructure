package section4;

public class Circle extends Shape {
    public int radius;
	
	public Circle( int r ){
		super("Circle"); 
		radius = r;
	}
	public double computeArea(){ // �߻�޼ҵ带 ����
		return Math.PI * radius * radius;
	}
	public double computePerimeter(){  // �߻�޼ҵ带 ����
		return 2.0 * Math.PI * radius;
	}
	public String toString()
	{
		return "Circle: radius is " + radius;
	}
}
