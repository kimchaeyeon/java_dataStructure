package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//2���� �迭���� �Ҽ�ã��
//�Է����� n*n���� ���� �ƴ� ���ڸ� ������ �׸��� ���� �־�����. �� ������ �� ����, ����, �밢���� 8��������
//���ӵ� ���ڵ��� ���ļ� ���� �� �ִ� ��� �Ҽ��� ã�Ƽ� �����ϴ� ���α׎c�� �ۼ��϶�, �ߺ��� ���� ����ص� �������.

// ��� ������ �����鿡 ���ؼ� ���������� ȯ���ϰ�, ���� �װ��� �Ҽ��̸� ����Ѵ�.
// ��� ������ �����鿡 ���ؼ�
// �ϳ��� ������ (������,����,����)�� ���ؼ� ���ǵȴ�.
// ������ 0~7�������� ���� ǥ������ (������ 8���̱⶧�� �������� 4�� �밢��)
// ������ġ (x,y)���� dir�������� ���̰� length�� ������ ������ ȯ���Ͽ� ��ȯ�϶�
// ���� �׷� ������ �������� ������ -1�� ��ȯ�϶�
public class Code21 {
	
	static int n;
	static int [][] grid;
	public static void main(String[] args) {
		try{
			Scanner inFile = new Scanner(new File("data.txt")); // �Է��� �����Ϸκ��� �д´�.
			n = inFile.nextInt();
			grid = new int [n][n];
			
			for (int i=0;i<n;i++)
				for(int j=0; j<n; j++)
					grid[i][j] = inFile.nextInt();
			inFile.close();
				
				for (int x=0; x<n; x++){
					for (int y=0; y<n; y++){ //��� ������ ����� (x,y)
						for (int dir=0; dir<8; dir++){ //������ ������� ����
							for(int length=1; length<=n; length++){ //������ ���̴� 1~n
								int value = computeValue(x,y,dir,length); //������ ������ ȯ��
								if (value != -1 && isPrime(value))//�Ҽ������� �˻�
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
			if( newX<0 || newX >= grid.length || newY<0 || newY >= grid.length) //������ ������ �����
				return -1;
			else
				return grid[newX][newY];
		}
		
		public static int computeValue(int x, int y, int dir, int len)
		{
			// x,y���� dir�������� ���ӵ� len���� digit�� ��������� ������ ��ȯ, �׷� ���� ������ -1
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
		
		//public static int getDigit(int x, int y, int dir, int k){//dir�������� kĭ �������ڸ�����ǥ ����
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
