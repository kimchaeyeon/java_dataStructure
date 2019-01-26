package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// 문자열 동일성 검사 boolean equals(), 문자열 사전식 순서 int compareTo(), 문자열 길이 int length(), 특정위치의 문자 char charAt(int) ,
// 지정한 문자의 위치검색 int indexOf(char), 지정된 범위의 부분 문자열 String substring(int,int) <- 시작구간은 폐구간, 끝구간은 개구간 (0,2)0~1까지를 구하는것

 public class Code23 {
// 단어의 앞뒤에 붙은 특수문자(숫자) 제거하기
	 
	 static String [] words = new String [100000];
	 static int [] count = new int [100000];
	 static int n =0;
	 
	 public static void main(String[] args){
		 Scanner kb = new Scanner(System.in);
		 while(true){
			 System.out.print("$ ");
			 String command = kb.next();
			 if (command.equals("read")){
				 String fileName = kb.next();
				 makeIndex(fileName);
			 }
			 else if (command.equals("find")){
				 String str = kb.next();
				 int index = findWord(str);
				 if(index > -1){
					 System.out.println("The word" + words[index] + "appears" +count[index] +"times.");
				 }
				 else
					 System.out.println("The word" + str + "does not appear.");
			 }
			 else if(command.equals("saves")){
				 String fileName = kb.next();
				 saveAs(fileName);
			 }
			 else if(command.equals("exit"))
				 break;
		 }
		 kb.close();
	 }
	 static void saveAs(String fileName) {
		 PrintWriter outFile;
		 try{
			 outFile = new PrintWriter(new FileWriter(fileName));
			 for (int i=0; i<n; i++)
				 outFile.println(words[i] + " " + count[i]);
			 outFile.close();
		 }catch(IOException e){
			 System.out.println("Save failed");
			 return;
		 }
	 }

	 static void makeIndex(String fileName) {
		 PrintWriter outFile;
		 try{
			 Scanner inFile = new Scanner(new File(fileName));
			 while(inFile.hasNext()){
				 String str = inFile.next();
				 
				 String trimmed =trimming(str);
				 
				 addWord(trimmed);
				 }
		 }catch(FileNotFoundException e){
			 System.out.println("No File");
			 return;
		 }
	 }
	 
	 private static String trimming(String str) {
		
		int i = 0, j=str.length()-1;
		while( i < str.length()-1 && !Character.isLetter(str.charAt(i)) // while i-th character is not letter, >='a'&& str.charAt(i) <= 'z') //영어 문자열이 아예 없는 문자열이 들어올수있다 i범위가넘어갈수 있기떄문에 범위를 지정해줘야함
			i++;
		while( j >= 0 && !Character.isLetter(str.charAt(j))
			j--;
		System.out.println(str + ":" + i +":" + j);
		if (i > j)
			return null;
			
		else
			return str.substring(i,j+1);
	}
	static void addWord(String str){
		 int index = findWord( str ); // returns -1 if not found
		 if (index != -1){          // found words[index] == str
			 count[index]++;
		 }
		 else{
			 words[n] = str;
			 count[n] =1;
		 }
	 }
	static void findWord(String str){
		
	}
}
