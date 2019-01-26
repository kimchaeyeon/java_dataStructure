package section2;

import java.util.Scanner;

public class Code08 {
// code06을 보완한 코드, 데이터와 메소드로 구성된 클래스를 따로 뺀다.	
	static Polynomial3 [] polys = new Polynomial3[100];
	static int n = 0;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("create")){
				char name = kb.next().charAt(0); //문자열로 먼저 입력받은 뒤,문자로 바꿈
				// 객체 생성
				polys[n] = new Polynomial3( name ); // 매개변수가 1개인 생성자를 생성, 아래 문장 필요없음
				//polys[n].name = name;
				
				//polys[n].terms= new Term3[100];
				//polys[n].nTerms =0;   -> Polynomial3 생성자에서 다 해주기 때문에 지울 수 있는 코드
				
				
				//Polynomial p = new Polynomial();
				//p.name = name;
				//p.nTerms = 0;				
				//polys[n] = p;
				n++; //정의된 다항식의 개수가 1 증가
			}
			else if (command.equals("add")){ // add f 2 3
				char name = kb.next().charAt(0);
				int index = find(name);
				if (index == -1){
					System.out.println("No such polynomial exists.");
				}
				else{
					int c = kb.nextInt();
					int e = kb.nextInt(); // 계수와 차수 입력받기
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


	private static int find(char name) 
	{
		for (int i=0; i<n; i++){
			if (polys[i].name == name)
				return i;
		}
		return 1;
	}
}
