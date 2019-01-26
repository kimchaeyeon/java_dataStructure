package Section2;

import java.util.Scanner;

// 입력으로 두 정수 a와 b(음이아닌 정수)를 받아 a의 b승을 계산한다.
public class Code16 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a, b); //매서드 power를 호출하면서 매개변수로 정수 a와 b의 값을 건낸다.
		
		System.out.println(result);
		kb.close();
	}
	static int power(int n, int m){ // 함수 이름 앞에 int의 의미는 리턴타입 static 을 써줘야 오류가 안난다.
		int prod = 1;
		for (int i=0; i<m; i++){
			prod = prod * n;
		}
		return prod;
	}
}
