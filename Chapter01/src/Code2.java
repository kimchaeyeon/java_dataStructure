
import java.util.Scanner; //��ĳ�� ��� ����ϱ� ���� ����Ʈ �ؾ��Ѵ�.

public class Code2 {

	public static void main(String[] args) {
		int number = 123; 
		Scanner kb = new Scanner(System.in);//Ű����κ��� �Է¹ް������
		System.out.print("Please enter an integer: ");
		int input = kb.nextInt(); //scanf("%d", &input)
		if(input == number){
			System.out.println("Numbers match! :-)");
		} else{
			System.out.println("Numbers do not match! :-(");
		}
		kb.close(); //�ݾ������

	}

}
