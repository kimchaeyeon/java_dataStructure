package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {
	// 데이터 파일로부터 입력을 받는다.
	static MyRectangle1 [] rects;//static MyRectangle1 [] rects = new MyRectangle1 [100];
	static int n = 0;
	// 데이터를 저장하기 위해 만든 클래스는 static으로 선언한 것이 없지만 메인함수 클래스는 static으로 선언함
	// 왜?
	public static void main(String[] args) {
		rects = new MyRectangle1 [100]; // new 명령으로 배열을 꼭 생성해야한다
		try {
			Scanner in = new Scanner (new File("data.txt"));
			while(in.hasNext()){ //파일 끝에 도달할때까지 4개 정수를 읽어라
				rects[n] = new MyRectangle1();
				rects[n].lu = new MyPoint1();
				rects[n].lu.x = in.nextInt();//4개의 정수가 하나의 사각형을
				rects[n].lu.y = in.nextInt(); // lu 도 참조변수이기 떄문에 생성해줘여함
				rects[n].width = in.nextInt();
				rects[n].height = in.nextInt();
				n++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file.");
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i=0; i<n; i++)
			System.out.println(rects[i].lu.x+" "+rects[i].lu.y+" "+rects[i].width+" "+rects[i].height);
	}
	private static void bubbleSort(){
		for (int i=n-1; i>0; i--){
			for (int j=0; j<i; j++){
				if( calcArea(rects[j]) > calcArea(rects[j+1])){
					MyRectangle1 tmp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
	}

	public static int calcArea( MyRectangle1 r)
	{
		return r.width * r.height;
	}
	

}
