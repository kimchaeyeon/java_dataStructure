package Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// ���ڿ� ���ϼ� �˻� boolean equals(), ���ڿ� ������ ���� int compareTo(), ���ڿ� ���� int length(), Ư����ġ�� ���� char charAt(int) ,
// ������ ������ ��ġ�˻� int indexOf(char), ������ ������ �κ� ���ڿ� String substring(int,int) <- ���۱����� �󱸰�, �������� ������ (0,2)0~1������ ���ϴ°�

 public class Code23 {
// �ܾ��� �յڿ� ���� Ư������(����) �����ϱ�
	 
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
		while( i < str.length()-1 && !Character.isLetter(str.charAt(i)) // while i-th character is not letter, >='a'&& str.charAt(i) <= 'z') //���� ���ڿ��� �ƿ� ���� ���ڿ��� ���ü��ִ� i�������Ѿ�� �ֱ⋚���� ������ �����������
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
