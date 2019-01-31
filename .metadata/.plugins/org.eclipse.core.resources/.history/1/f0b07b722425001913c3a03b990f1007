package section2;

public class Term {
	public int coef;//계수와 차수를 정의로 가정할 것이다.
	public int expo;
	
	public Term( int c, int e){ //생성자
		coef = c;
		expo = e;
	}
	public int calc( int x ){ //각각의 항을 계산해주는 메소드
		return coef*(int)Math.pow(x,expo); //타입이 더블 타입이라 에러가 남, 그래서 타입변환
	}
	public String toString(){ //출력하는 메소드
		return coef + "x^" + expo;
	}

}
