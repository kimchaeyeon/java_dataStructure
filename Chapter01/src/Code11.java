import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int [n];
		
		//쌍을 검사할 떄는 두개의 중첩된 for문을 사용
		for( int i=0; i<n; i++ )
			data[i] = kb.nextInt();
		kb.close();
		
		int count = 0;
		for( int i=0; i<n; i++ ){
			for ( int j=i+1; j<n; j++ ){ // i < j 경우에만 순서쌍을 검사
				if ( data[i] == data[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
