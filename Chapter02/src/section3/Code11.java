package section3;

import java.util.Scanner;

public class Code11 {
// code06�� ������ �ڵ�, �����Ϳ� �޼ҵ�� ������ Ŭ������ ���� ����.	
// code08�� ������ �ڵ�, main�Լ� ���� �޼ҵ�� static������ �ƴϰԲ� �����Ѵ�.
	Polynomial3 [] polys = new Polynomial3[100];
	int n = 0;
	public void processCommand()
	{	
		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("create")){
				char name = kb.next().charAt(0); //���ڿ��� ���� �Է¹��� ��,���ڷ� �ٲ�
				// ��ü ����
				polys[n] = new Polynomial3( name ); // �Ű������� 1���� �����ڸ� ����, �Ʒ� ���� �ʿ����
				//polys[n].name = name;
				
				//polys[n].terms= new Term3[100];
				//polys[n].nTerms =0;   -> Polynomial3 �����ڿ��� �� ���ֱ� ������ ���� �� �ִ� �ڵ�
				
				
				//Polynomial p = new Polynomial();
				//p.name = name;
				//p.nTerms = 0;				
				//polys[n] = p;
				n++; //���ǵ� ���׽��� ������ 1 ����
			}
			else if (command.equals("add")){ // add f 2 3
				char name = kb.next().charAt(0);
				int index = find(name);
				if (index == -1){
					System.out.println("No such polynomial exists.");
				}
				else{
					int c = kb.nextInt();
					int e = kb.nextInt(); // ����� ���� �Է¹ޱ�
					polys[index].addTerm(c,e);
				}
				
			}
			else if (command.equals("calc")){
				char name = kb.next().charAt(0);
				int index = find(name);
				if (index == -1){
					System.out.println("No such polynomial exists.");
				}
				else{
				int x = kb.nextInt();
				int result = polys[index].calcPolynomial(x);
				System.out.println(result);
				}
			}
			else if (command.equals("print")){
				char name = kb.next().charAt(0);
				int index = find(name);
				if (index == -1){
					System.out.println("No such polynomial exists.");
				}
				else{
					polys[index].printPolynomial();
				}
			}
			else if (command.equals("exit")){
				break;
			}
			
		}
		kb.close();
	}
	private int find(char name) 
	{
		for (int i=0; i<n; i++){
			if (polys[i].name == name)
				return i;
		}
		return 1;
	}	
	public static void main(String[] args) {
		Code11 app = new Code11(); //������ ����ִ� ���μ����� ��ü�� �����ϰ�
		app.processCommand();      //��ü�� ȣ���ϰ� �Ǹ�  main �޼ҵ常 static������ �� �� �ִ�.
	}


}
