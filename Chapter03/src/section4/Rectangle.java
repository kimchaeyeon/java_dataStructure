package section4;

public class Rectangle extends Shape {  //Shape클래스 안에 있는 추상메소드를 실제로 구현해야함
	public int width;
	public int height;
	
	public Rectangle( int w, int h){
		super("Ractangle"); 
		width = w;
		height = h;
	}
	public double computeArea(){ // 추상메소드를 구현
		return (double)width*height;
	}
	public double computePerimeter(){  // 추상메소드를 구현
		return 2.0*(width+height);
	}
	public String toString()
	{
		return "Rectangle: width is " + width + ",height is " + height;
	}
}
