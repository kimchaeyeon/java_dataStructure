package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Code05�� ������ �ڵ�.

public class Code09 {
	// ������ ���Ϸκ��� �Է��� �޴´�.
	static MyRectangle2 [] rects;//static MyRectangle1 [] rects = new MyRectangle1 [100];
	static int n = 0;
	// �����͸� �����ϱ� ���� ���� Ŭ������ static���� ������ ���� ������ �����Լ� Ŭ������ static���� ������
	// ��?
	public static void main(String[] args) {
		rects = new MyRectangle2 [100]; // new �������� �迭�� �� �����ؾ��Ѵ�
		try {
			Scanner in = new Scanner (new File("data.txt"));
			while(in.hasNext()){ //���� ���� �����Ҷ����� 4�� ������ �о��
				int x= in.nextInt();
				int y= in.nextInt();
				int w= in.nextInt();
				int h= in.nextInt();
				rects[n] = new MyRectangle2(x,y,w,h);
				n++;
				// �Ǵ� rects[n++] = new MyRectangle2(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file.");
			System.exit(1);
		}
		for(int i=0; i<n; i++)
			System.out.println(rects[i].toString());
		
		bubbleSort();
		
		for(int i=0; i<n; i++)
			System.out.println(rects[i].toString());
	}
	private static void bubbleSort(){
		for (int i=n-1; i>0; i--){
			for (int j=0; j<i; j++){
				if( rects[j].calcArea() > rects[j+1].calcArea()){
					MyRectangle2 tmp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
	}


}