package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		try{
			Scanner in = new Scanner(new File("data.txt"));
			int n = in.nextInt();
			OrthoPolygon thePolygon = new OrthoPolygon(n); //꼭지점의 개수를 먼저 입력받아 다각형을 생성한다.
			for(int i=0; i<n; i++)
				thePolygon.addVertex(new MyPoint2(in.nextInt(),in.nextInt())); //꼭지점의 좌표를 시계방향 순서로 입력받아 다각형에 추가한다.
			MyPoint2 thePoint =  new MyPoint2(in.nextInt(),in.nextInt()); // 테스트할 점의 좌표를 입력받아 점 p를 생성한다.
			in.close();
			if (thePolygon.contains(thePoint)) // 내부인지 외부인지 검사한다.
				System.out.println("yes");
			else
				System.out.println("No");
		}catch(FileNotFoundException e){
			System.out.println("No data file exits.");
			System.exit(1);
		}

	}

}
