import java.util.Scanner;

public class Cose12 {
// n개의 정수를 입력받아 배열에 저장한 후 이들중에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값을 구하기
// 중간에 음수가 포함되어 있는 부분까지 생각해서
// 모든 가능한 구간을 검사하면서 각 구간의 합을 구한 후 그 중 최대값을 구하기

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int [n];
		for (int i=0; i<n; i++){
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int max =0; //최대 값이 0보다 작아지는 경우는 없기 때문데 0으로 둔다
		for (int i=0; i<n; i++){
			int sum = 0;
			for (int j=i; j<n; j++){ // 시작점과 끝점이 같다
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
