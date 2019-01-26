package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
// 데이터 파일로부터 사람들의 이름과 전화번호를 입력받아 배열 members에 저장한 후, 입력된 순서대로 출력하려고 한다.
// 이 코드에서 잘못된 점들을 모두 찾아서 수정하라
	static Person1 [] members;
	static int n = 0;
	public static void main(String[] args) {
		members = new Person1[100];// 배열을 생성해줘야 한다.
		try {
			Scanner in = new Scanner(new File("input.txt"));
			while(in.hasNext()){
				String nm = in.next();
				String nb = in.next();
				members[n] = new Person1(); //객체를 생성해줘야만 한다. 참조변수이기 때문에
				members[n].name=nm; 
				members[n].name=nb;
				n++;
			}

			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
		}
		
		for (int i=0; i<n; i++){
			System.out.println(members[i].name+ " " + members[i].number);
		}
	}

}
