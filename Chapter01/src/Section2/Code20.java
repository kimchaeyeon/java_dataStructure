package Section2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// input.txt ��� ���Ϸκ��� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� �����ϰ� ���������� ������� ����Ѵ�.
public class Code20 {
	
	static String [] name = new String[1000];
	static String [] number = new String[1000];
	static int n = 0; //��� ����

	public static void main(String[] args) {
		
		try{
			Scanner inFile = new Scanner( new File("input.txt")); //System.in �� ǥ���Է�
	
			while( inFile.hasNext()){//��ĳ�ʰ� �������ִ� �޼ҵ��� detect EOF
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		
		} catch (FileNotFoundException e){
			System.out.println("No File");
			System.exit(1);
			//return; // main�Լ��̱� ������ ���α׷��� ����Ǵ°��� ������ ���α׷��� �����ϴ� ������ �ƴ�
		}
        // file�� �߰ߵ��� �ʾ��� ���� ���ܸ� ó��������Ѵ�.		
		
		bubbleSort(); // �Ű������� �Ѱ��� �ʿ䰡 ����
		
		for (int i=0; i<n; i++){
			System.out.println(name[i] + ":" + number[i]);
		}
		
	}
	
	static void bubbleSort()
	{
		for(int i=n; i>0; i--){
			for(int j=0; j<i; j++){
				if ( name[j].compareTo( name[j+1] ) > 0 ){ /// ��Ʈ���̴ϱ� ũ��񱳸� �̷������� �ؾ���, ũ��  ��� ������ ���� ������ 0 str1.equals(str2) �̷������� ������ Ȯ���ؾ���
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