
import java.util.Scanner; //��ĳ�� ��� ����ϱ� ���� ����Ʈ �ؾ��Ѵ�.

public class Code3 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null; 
		Scanner kb = new Scanner(System.in);//Ű����κ��� �Է¹ް������
		System.out.print("Please enter an integer: ");
		input = kb.next(); //scanf("%s", &input)
		if(str.equals(input)){ //��Ʈ���� == �����ڷ� ������ �� �� ����
			System.out.println("Strings match! :-)");
		} else{
			System.out.println("Strings do not match! :-(");
		}
		kb.close(); //�ݾ������

	}

}
