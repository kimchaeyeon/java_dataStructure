import java.util.Scanner;
// ����ڷκ��� n���� ������ �Է¹��� �� �հ� �ִ밪�� ���Ͽ� ����ϴ� ���α׷�
public class Code8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //���� �Է� ���� ��
		int [] data = new int[n]; //�Է¹��� ������ ������ �迭�� �����ϱ�
		
		for (int i =0; i<n; i++)
			data[i]= kb.nextInt();
		kb.close(); //��ĳ�� ���鼭 �̸� �ݾƵθ� ����� ����
		
		int sum = 0, max = data[0]; 
		for( int i=0; i<n; i++){
			sum += data[i];
			if (data[i] > max) max=data[i];
		}
		System.out.println("The sum is"+ sum + "and the maxinium is" + max);
	}

}
