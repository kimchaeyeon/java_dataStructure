package section3;
// �����ڸ� ���� �ڵ带 ����
public class Term3 {
	public int coef; //����� ���� �ƴ�������� ����
	private int expo;
	
	public Term3(int c, int e)
	{
		coef = c;
		expo = e; //�Ű������� ���� �����ڸ� �ʱ�ȭ
	}
	public int getExpo() // expo�� private�������� �����ϰ�  get�޼ҵ带 ���������μ� �ٸ� Ŭ�������� expo�� ���� ������ �� ���Բ� �� �� �ִ�.
	{ //getter method �����͸� �д� �뵵�� ���� �޼ҵ�
		return expo;
	}

	public int calcTerm(int x) 
	{
		return (int)(coef * Math.pow( x, expo)) ; //�����Լ� ���
	}

	public void printTerms() 
	{
		System.out.print(coef + "x^" + expo);
	}
}