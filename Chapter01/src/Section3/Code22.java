package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {
	
	static String [] words = new String[100000];
	static int [] count = new int [100000];
	static int n = 0; //목록에 저장된 단어의 개수
// 사용자로부터 명령을 받아서 문제를 해결하는 프로그램
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in); // while문 밖에 스캐너 만들어주기 
		while(true){ //무한 루프 괄호안에 조건이 true 경우에만  while 문이 돌아가는데 true로 지정해주었기 때문에 나중에  break문 등으로 빠져나갈 수 있게끔
			
			System.out.print("$ ");
			String command = kb.next(); //명령어를 입력받기 (read,find,exit...)
			if (command.equals("read")){ //문자열 비교는 equals
				String fileName = kb.next(); //파일 이름을 입력해야하는 명령어를 만들었기 때문에
				makeIndex(fileName);//자신이 입력한 파일네임을 알아야하니 매개변수로 넘겨줘야함
			}
			else if (command.equals("find")){
				String str = kb.next();
				int index = findWord(str);
				if (index > -1){
					System.out.println("The word " + words[index] + " appears " + count[index] + " times");
				}
				else{

					System.out.println("The word" + str + " does not appear."); 
				}
			}
			else if(command.equals("saveas")){ //파일로 저장하기
				String fileName = kb.next();
				saveAs(fileName);//
			}
			else if(command.equals("exit"))
				break;
			
		}
		kb.close();
		
		for (int i=0; i<n; i++)
			System.out.println(words[i] +" " + count[i]);

	}
	
	static void saveAs( String fileName ){ //파일로 출력하는 함수 만들기
		
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for (int i=0; i<n; i++){
				outFile.println(words[i]+" "+count[i]); // 새로운 파일에 출력하는것 
			}
			outFile.close();
			
		} catch (IOException e) {
			System.out.println("Save failed.");
			return;
		}
		
	}
	
	static void makeIndex( String fileName ){
		try{
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()){
				String str = inFile.next();//while문 돌때마다 단어를 하나씩 읽기 ,새로 읽은 str을 목록에 추가, 이미 있는 단어인지 아닌지 확인
				addWord( str );
			}
			inFile.close();
		} catch(FileNotFoundException e){
			System.out.println("No file");
			return;//makeIndex가 아무일도 하지 않을때 리턴해주기
		}
	
	}
	
	static void addWord(String str){
		//목록에 있는지 없는지 확인하고 목록에 추가하는 함수
		int index = findWord( str );   //returns -1 if not found
		if ( index != -1 ) { //찾았다면 words[index]==str
			count[index]++; // 이미 목록에 있기에 추가할 필요없이 카운트의 횟수를 증가 시킴
		}
		else { //not found
			words[n]=str;//n+1번째 단어  
			count[n] = 1;
			n++;
		}
	}
	static int findWord(String str){
		for (int i=0; i<n; i++)
			if (words[i].equalsIgnoreCase(str))
				return i;
		    return -1;
	}

}
