
// 클래스 밖에 변수를 선언할 수는 없다. 모든건 클래스 안에서 이루어져야함
public class Code1 {
	static int num;  //메인함수 바깥에서 선언 static으로 선언하자. 전역변수
	
	public static void main(String[] args){
		
		int anotherNum = 5;  //메인함수 안에 선언. 지역변수
		
		num = 2;
		
		System.out.println(num + anotherNum);
		
		System.out.println("Num: " + num);
		
		System.out.println("AnotherNum: " + anotherNum);
		
		System.out.println("Sum: " + (num + anotherNum)); //left associativity
	}

}
