
// Ŭ���� �ۿ� ������ ������ ���� ����. ���� Ŭ���� �ȿ��� �̷��������
public class Code1 {
	static int num;  //�����Լ� �ٱ����� ���� static���� ��������. ��������
	
	public static void main(String[] args){
		
		int anotherNum = 5;  //�����Լ� �ȿ� ����. ��������
		
		num = 2;
		
		System.out.println(num + anotherNum);
		
		System.out.println("Num: " + num);
		
		System.out.println("AnotherNum: " + anotherNum);
		
		System.out.println("Sum: " + (num + anotherNum)); //left associativity
	}

}
