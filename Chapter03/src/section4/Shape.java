package section4;

public abstract class Shape implements MyComparable { // compareTo�޼ҵ带 �����ؾ��Ѵ�
	
	public String shapeName; //�� ������ �簢���̸� ���ޱ� �ﰢ���̸� Ʈ���̾ޱ� ���.. 
	
	public Shape( String name ){ // �����ڴ� ���ڿ��� �޾Ƽ� ���Գ��ӿ� �����ϰ� �ȴ�.
		shapeName = name;
	}
	
	public abstract double computeArea(); // �ΰ��� �߻�޼ҵ带 ����
	public abstract double computePerimeter();
	// ���࿡ �� �߻� �޼ҵ尡 ���ٸ�, shapeApplicationŬ������ shape[i] �κп��� ������ ������ ���� �ȴ�.

	public int compareTo( Object other ){//ũ�� ���踦 �����ִ� �޼ҵ带 ��������.�ڱ��ڽŰ� �Ű������� ������ ���̿� ũ�⸦ ���ϴ� �޼ҵ�
		double myArea = computeArea(); 
		double yourArea = ((Shape)other).computeArea(); //other�� ����Ÿ������ ��ȯ������Ѵ�
		if (myArea < yourArea ) return -1;
		else if ( myArea == yourArea ) return 0;
		else return 1;
	}
}
