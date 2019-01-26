package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//2차원 배열에서 소수찾기
//입력으로 n*n개의 음이 아닌 한자리 정수가 그림과 같이 주어진다. 이 정수들 중 가로, 세로, 대각선의 8방향으로
//연속된 숫자들을 합쳐서 만들 수 있는 모든 소수를 찾아서 나열하는 프로그럄을 작성하라, 중복된 수를 출력해도 상관없음.

// 모든 가능한 수열들에 대해서 정수값으로 환산하고, 만약 그것이 소수이면 출력한다.
// 모든 가능한 수열들에 대해서
// 하나의 수열은 (시작점,방향,길이)에 의해서 정의된다.
// 방향은 0~7번까지의 수로 표현하자 (방향이 8개이기때문 동서남북 4개 대각선)
// 시작위치 (x,y)에서 dir방향으로 길이가 length인 수열을 정수로 환산하여 반환하라
// 만약 그런 수열이 존재하지 않으면 -1을 반환하라
public class Code21 {
	
	static int n;
	static int [][] grid;
	public static void main(String[] args) {
		try{
			Scanner inFile = new Scanner(new File("data.txt")); // 입력은 이파일로부터 읽는다.
			n = inFile.nextInt();
			grid = new int [n][n];
			
			for (int i=0;i<n;i++)
				for(int j=0; j<n; j++)
					grid[i][j] = inFile.nextInt();
			inFile.close();
				
				for (int x=0; x<n; x++){
					for (int y=0; y<n; y++){ //모든 가능한 출발점 (x,y)
						for (int dir=0; dir<8; dir++){ //수열이 뻗어나가는 방향
							for(int length=1; length<=n; length++){ //수열의 길이는 1~n
								int value = computeValue(x,y,dir,length); //수열을 정수로 환산
								if (value != -1 && isPrime(value))//소수인지를 검사
									System.out.println(value);
							}
						}
					}
				}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		

		static int [] offsetX ={0,1,1,1,0,-1,-1,-1};
		static int [] offsetY ={-1,-1,0,1,1,1,0,-1};
		
		public static int getDigit(int x, int y, int dir, int k)
		{
			int newX= x+k*offsetX[dir];
			int newy= y+k*offsetY[dir];
			if( newX<0 || newX >= grid.length || newY<0 || newY >= grid.length) //지정된 단위를 벗어나면
				return -1;
			else
				return grid[newX][newY];
		}
		
		public static int computeValue(int x, int y, int dir, int len)
		{
			// x,y에서 dir방향으로 연속된 len개의 digit로 만들어지는 정수를 반환, 그런 값이 없으면 -1
			int value=0;
			for (int i=0; i<len; i++){
				int digit = getDigit(x,y,dir,i);
				if (digit == -1)
					return -1;
				value = value*10+digit;
			}
			return value;
		}
		public boolean isPrime(int k)
		{
			
		}
		
		//public static int getDigit(int x, int y, int dir, int k){//dir방향으로 k칸 떨어진자리의좌표 리턴
		//	int newX = x; newY = y;
		//	switch(dir){
		//	case 0: newY -= K; break;
		//	case 1: newX += k; break;
		//	case 2: newX += k; break;
		//	case 3: newX += k; newY += k; break;
		//	case 4: newY += k; break;
		//	case 5: newX -= k; newY += k; break;
		//	case 6: newX -= k; break;
		//	case 7: newX -= k; newY -= k; break; 
		//	}
		//	if(newX < 0 || newX >= n || newY <0 || newY >= n)
		//		return -1;
		//	return grid[newX][newY];
		//}

	}

}
