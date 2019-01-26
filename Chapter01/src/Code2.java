
import java.util.Scanner; //스캐너 기능 사용하기 위해 임포트 해야한다.

public class Code2 {

	public static void main(String[] args) {
		int number = 123; 
		Scanner kb = new Scanner(System.in);//키보드로부터 입력받고싶을때
		System.out.print("Please enter an integer: ");
		int input = kb.nextInt(); //scanf("%d", &input)
		if(input == number){
			System.out.println("Numbers match! :-)");
		} else{
			System.out.println("Numbers do not match! :-(");
		}
		kb.close(); //닫아줘야함

	}

}
