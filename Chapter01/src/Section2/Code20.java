package Section2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// input.txt 라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 사전식으로 순서대로 출력한다.
public class Code20 {
	
	static String [] name = new String[1000];
	static String [] number = new String[1000];
	static int n = 0; //사람 숫자

	public static void main(String[] args) {
		
		try{
			Scanner inFile = new Scanner( new File("input.txt")); //System.in 은 표준입력
	
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
		
		bubbleSort(); // 매개변수로 넘겨줄 필요가 없음
		
		for (int i=0; i<n; i++){
			System.out.println(name[i] + ":" + number[i]);
		}
		
	}
	
	static void bubbleSort()
	{
		for(int i=n; i>0; i--){
			for(int j=0; j<i; j++){
				if ( name[j].compareTo( name[j+1] ) > 0 ){ /// 스트링이니깐 크기비교를 이런식으로 해야함, 크면  양수 작으면 음수 같으면 0 str1.equals(str2) 이런식으로 같은지 확인해야함
					//swap name[j] and name[j+1]
					
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
	}

}