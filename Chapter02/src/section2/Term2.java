package section2;

public class Term2 {
	public int coef; //계수를 음이 아닌정수라고 가정
	public int expo;

	public int calcTerm(int x) 
	{
		return (int)(coef * Math.pow( x, expo)) ; //지수함수 계산
	}

	public void printTerms() 
	{
		System.out.print(coef + "x^" + expo);
	}
}