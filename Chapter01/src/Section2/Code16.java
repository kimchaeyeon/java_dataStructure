package Section2;

import java.util.Scanner;

// �Է����� �� ���� a�� b(���̾ƴ� ����)�� �޾� a�� b���� ����Ѵ�.
public class Code16 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a, b); //�ż��� power�� ȣ���ϸ鼭 �Ű������� ���� a�� b�� ���� �ǳ���.
		
		System.out.println(result);
		kb.close();
	}
	static int power(int n, int m){ // �Լ� �̸� �տ� int�� �ǹ̴� ����Ÿ�� static �� ����� ������ �ȳ���.
		int prod = 1;
		for (int i=0; i<m; i++){
			prod = prod * n;
		}
		return prod;
	}
}
