package section4;

public class Rectangle extends Shape {  //ShapeŬ���� �ȿ� �ִ� �߻�޼ҵ带 ������ �����ؾ���
	public int width;
	public int height;
	
	public Rectangle( int w, int h){
		super("Ractangle"); 
		width = w;
		height = h;
	}
	public double computeArea(){ // �߻�޼ҵ带 ����
		return (double)width*height;
	}
	public double computePerimeter(){  // �߻�޼ҵ带 ����
		return 2.0*(width+height);
	}
	public String toString()
	{
		return "Rectangle: width is " + width + ",height is " + height;
	}
}
