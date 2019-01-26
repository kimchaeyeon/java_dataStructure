package section2;
// �ϳ��� ���� �ٰ����� ǥ���ϱ� ���� Ŭ����
public class OrthoPolygon {
	public int n; // �������� ����
	public MyPoint2 [] vertices; // ���������� ����

	public OrthoPolygon( int k ) { // ������ �Է����� �ޱ�
		n = 0;
		vertices = new MyPoint2 [k];
	}
	
	public void addVertex( MyPoint2 v ) //���� ���� �ٰ����� ������ �߰����ִ�
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
		
	public boolean contains( MyPoint2 p)// �ٰ����� �� �ٸ� ��p�� ���ο� �����ϰ� �ִ����� �˻����ִ� �Լ�
	{
		OrthoLine arrow = new OrthoLine( p, new MyPoint2 ( maxX()+1,p.y));
		int count = 0;
		for( int i =0; i<n; i++){
			OrthoLine edge = new OrthoLine(vertices[i], vertices[(i+1) % n]); //���� ����
			if ( arrow.intersects(edge))
				count++;
		}
		return (count% 2 ==1);
	}
}
