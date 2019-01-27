package section4;

public abstract class Shape implements MyComparable { // compareTo메소드를 구현해야한다
	
	public String shapeName; //이 쉐입이 사각형이면 렉텡글 삼각형이면 트라이앵글 등등.. 
	
	public Shape( String name ){ // 생성자는 문자열을 받아서 쉐입네임에 저장하게 된다.
		shapeName = name;
	}
	
	public abstract double computeArea(); // 두개의 추상메소드를 정의
	public abstract double computePerimeter();
	// 만약에 이 추상 메소드가 없다면, shapeApplication클래스의 shape[i] 부분에서 컴파일 오류가 나게 된다.

	public int compareTo( Object other ){//크기 관계를 비교해주는 메소드를 구현하자.자기자신과 매개변수로 들어오는 아이와 크기를 비교하는 메소드
		double myArea = computeArea(); 
		double yourArea = ((Shape)other).computeArea(); //other를 쉐입타입으로 변환해줘야한다
		if (myArea < yourArea ) return -1;
		else if ( myArea == yourArea ) return 0;
		else return 1;
	}
}
