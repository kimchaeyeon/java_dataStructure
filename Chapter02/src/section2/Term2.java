package section2;

public class Term2 {
	public int coef; //����� ���� �ƴ�������� ����
	public int expo;

	public int calcTerm(int x) 
	{
		return (int)(coef * Math.pow( x, expo)) ; //�����Լ� ���
	}

	public void printTerms() 
	{
		System.out.print(coef + "x^" + expo);
	}
}