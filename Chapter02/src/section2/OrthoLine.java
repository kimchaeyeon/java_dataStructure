package section2;
// 수직선이나 수평선을 만들기 위한 클래스
public class OrthoLine {
	public MyPoint2 u;
	public MyPoint2 v;
	
	public OrthoLine( MyPoint2 p , MyPoint2 q )
	{
		u = p;
		v = q;
		if (p.x > q.x || p.x == q.x && p.x > q.x)
			swap();
	}
	public void swap()
	{
		MyPoint2 tmp = u;
		u = v;
		v = tmp;
	}
	
	public OrthoLine( int x1, int y1, int x2, int y2)
	{
		u = new MyPoint2(x1,y1);
		v = new MyPoint2(x2,y2);
	}
	
	public boolean isVertical()//내가 수직선분인지를 검사하는 함수
	{
		return u.x == v.x; // 선분의 양끝점의 x좌표가 동일하면
	}
	public boolean intersects( OrthoLine other ) // 다른 선분 하나를 받아서 나와 교차하는지 검사
	{
		if ( isVertical()&& !other.isVertical() ) //나는 수직 다른건 수평선분이면
			return( other.u.x < u.x && other.v.x > u.x && u.y < other.u.y && v.y > other.u.y );
		else if ( !isVertical() && other.isVertical() )  //나는 수평, 다른건 수직이면
			return( other.u.y < u.y && other.v.y > u.y && u.x < other.u.x && v.x > other.u.x );
		else // 그렇지 않으면 (둘다 수직선분이거나 둘다 수평선분이면 교차하지 않으므로 무조건 거짓
			return false;
	}
}
