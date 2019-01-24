package section3;
// 생성자를 만들어서 코드를 개선
public class Term3 {
	public int coef; //계수를 음이 아닌정수라고 가정
	private int expo;
	
	public Term3(int c, int e)
	{
		coef = c;
		expo = e; //매개변수로 받은 생성자를 초기화
	}
	public int getExpo() // expo를 private형식으로 지정하고  get메소드를 생성함으로서 다른 클래스에서 expo를 절대 변경할 수 없게끔 할 수 있다.
	{ //getter method 데이터를 읽는 용도로 만든 메소드
		return expo;
	}

	public int calcTerm(int x) 
	{
		return (int)(coef * Math.pow( x, expo)) ; //지수함수 계산
	}

	public void printTerms() 
	{
		System.out.print(coef + "x^" + expo);
	}
}