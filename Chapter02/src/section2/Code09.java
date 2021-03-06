package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Code05를 개선한 코드.

public class Code09 {
	// 데이터 파일로부터 입력을 받는다.
	static MyRectangle2 [] rects;//static MyRectangle1 [] rects = new MyRectangle1 [100];
	static int n = 0;
	// 데이터를 저장하기 위해 만든 클래스는 static으로 선언한 것이 없지만 메인함수 클래스는 static으로 선언함
	// 왜?
	public static void main(String[] args) {
		rects = new MyRectangle2 [100]; // new 명령으로 배열을 꼭 생성해야한다
		try {
			Scanner in = new Scanner (new File("data.txt"));
			while(in.hasNext()){ //파일 끝에 도달할때까지 4개 정수를 읽어라
				int x= in.nextInt();
				int y= in.nextInt();
				int w= in.nextInt();
				int h= in.nextInt();
				rects[n] = new MyRectangle2(x,y,w,h);
				n++;
				// 또는 rects[n++] = new MyRectangle2(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
				
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
