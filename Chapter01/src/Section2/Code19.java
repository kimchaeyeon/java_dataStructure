package Section2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// input.txt 라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력한다.
public class Code19 {

	public static void main(String[] args) {
		
		String [] name = new String[1000];
		String [] number = new String[1000];
		int n = 0; //사람 숫자
		
		try{
			Scanner inFile = new Scanner(new File("input.txt")); //System.in 은 표준입력
	
			while( inFile.hasNext()){//스캐너가 제공해주는 메소드임 detect EOF
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		
		} catch (FileNotFoundException e){
			System.out.println("No File");
			System.exit(1);
			//return; // main함수이기 때문에 프로그램이 종료되는거지 원래는 프로그램을 종료하는 수단이 아님
		}
        // file이 발견되지 않았을 때의 예외를 처리해줘야한다.		
		for (int i=0; i<n; i++){
			System.out.println(name[i] + ":" + number[i]);		}
		
	}

}
