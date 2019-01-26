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
	static int n = 0; //��Ͽ� ����� �ܾ��� ����
// ����ڷκ��� ����� �޾Ƽ� ������ �ذ��ϴ� ���α׷�
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in); // while�� �ۿ� ��ĳ�� ������ֱ� 
		while(true){ //���� ���� ��ȣ�ȿ� ������ true ��쿡��  while ���� ���ư��µ� true�� �������־��� ������ ���߿�  break�� ������ �������� �� �ְԲ�
			
			System.out.print("$ ");
			String command = kb.next(); //��ɾ �Է¹ޱ� (read,find,exit...)
			if (command.equals("read")){ //���ڿ� �񱳴� equals
				String fileName = kb.next(); //���� �̸��� �Է��ؾ��ϴ� ��ɾ ������� ������
				makeIndex(fileName);//�ڽ��� �Է��� ���ϳ����� �˾ƾ��ϴ� �Ű������� �Ѱ������
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
			else if(command.equals("saveas")){ //���Ϸ� �����ϱ�
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
	
	static void saveAs( String fileName ){ //���Ϸ� ����ϴ� �Լ� �����
		
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for (int i=0; i<n; i++){
				outFile.println(words[i]+" "+count[i]); // ���ο� ���Ͽ� ����ϴ°� 
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
				String str = inFile.next();//while�� �������� �ܾ �ϳ��� �б� ,���� ���� str�� ��Ͽ� �߰�, �̹� �ִ� �ܾ����� �ƴ��� Ȯ��
				addWord( str );
			}
			inFile.close();
		} catch(FileNotFoundException e){
			System.out.println("No file");
			return;//makeIndex�� �ƹ��ϵ� ���� ������ �������ֱ�
		}
	
	}
	
	static void addWord(String str){
		//��Ͽ� �ִ��� ������ Ȯ���ϰ� ��Ͽ� �߰��ϴ� �Լ�
		int index = findWord( str );   //returns -1 if not found
		if ( index != -1 ) { //ã�Ҵٸ� words[index]==str
			count[index]++; // �̹� ��Ͽ� �ֱ⿡ �߰��� �ʿ���� ī��Ʈ�� Ƚ���� ���� ��Ŵ
		}
		else { //not found
			words[n]=str;//n+1��° �ܾ�  
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
