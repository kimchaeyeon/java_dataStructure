
import java.util.Scanner; //스캐너 기능 사용하기 위해 임포트 해야한다.

public class Code3 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null; 
		Scanner kb = new Scanner(System.in);//키보드로부터 입력받고싶을때
		System.out.print("Please enter an integer: ");
		input = kb.next(); //scanf("%s", &input)
		if(str.equals(input)){ //스트링은 == 연산자로 같은지 알 수 없다
			System.out.println("Strings match! :-)");
		} else{
			System.out.println("Strings do not match! :-(");
		}
		kb.close(); //닫아줘야함

	}

}
