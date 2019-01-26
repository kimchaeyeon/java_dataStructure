package section2;
// 하나의 직교 다각형을 표현하기 위한 클래스
public class OrthoPolygon {
	public int n; // 꼭지점의 개수
	public MyPoint2 [] vertices; // 꼭지점들의 집합

	public OrthoPolygon( int k ) { // 개수만 입력으로 받기
		n = 0;
		vertices = new MyPoint2 [k];
	}
	
	public void addVertex( MyPoint2 v ) //위에 점을 다각형의 점으로 추가해주는
	{
		vertices[n++] = v;
	}
	
	public int maxX()
	{
		int max = vertices[0].x;
		for (int i=0; i<n; i++){
			if(vertices[i].x > max)
				max = vertices[i].x;
		}
		return max;
	}
		
	public boolean contains( MyPoint2 p)// 다각형이 또 다른 점p를 내부에 포함하고 있는지를 검사해주는 함수
	{
		OrthoLine arrow = new OrthoLine( p, new MyPoint2 ( maxX()+1,p.y));
		int count = 0;
		for( int i =0; i<n; i++){
			OrthoLine edge = new OrthoLine(vertices[i], vertices[(i+1) % n]); //직교 선분
			if ( arrow.intersects(edge))
				count++;
		}
		return (count% 2 ==1);
	}
}
