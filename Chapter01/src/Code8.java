import java.util.Scanner;
// 사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하는 프로그램
public class Code8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //정수 입력 받을 때
		int [] data = new int[n]; //입력받은 정수를 저장할 배열을 선언하기
		
		for (int i =0; i<n; i++)
			data[i]= kb.nextInt();
		kb.close(); //스캐너 열면서 미리 닫아두면 까먹지 않음
		
		int sum = 0, max = data[0]; 
		for( int i=0; i<n; i++){
			sum += data[i];
			if (data[i] > max) max=data[i];
		}
		System.out.println("The sum is"+ sum + "and the maxinium is" + max);
	}

}
