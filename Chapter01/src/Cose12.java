import java.util.Scanner;

public class Cose12 {
// n���� ������ �Է¹޾� �迭�� ������ �� �̵��߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ� ���� �� �ִ� �ִ밪�� ���ϱ�
// �߰��� ������ ���ԵǾ� �ִ� �κб��� �����ؼ�
// ��� ������ ������ �˻��ϸ鼭 �� ������ ���� ���� �� �� �� �ִ밪�� ���ϱ�

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int [n];
		for (int i=0; i<n; i++){
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int max =0; //�ִ� ���� 0���� �۾����� ���� ���� ������ 0���� �д�
		for (int i=0; i<n; i++){
			int sum = 0;
			for (int j=i; j<n; j++){ // �������� ������ ����
				sum += data[j];				
				if(sum > max)
					max = sum;
				//add data[i]...data[j]
				//if the sum > max;
				//   max = the sum;
			}
		}
		System.out.println(max);
	}

}
