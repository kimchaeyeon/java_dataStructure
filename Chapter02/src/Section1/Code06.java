package Section1;

import java.util.Scanner;

public class Code06 {
	
	static Polynomial [] polys = new Polynomial[100];
	static int n = 0;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("create")){
				char name = kb.next().charAt(0); //문자열로 먼저 입력받은 뒤,문자로 바꿈
				// 객체 생성
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].terms= new Term[100];
				polys[n].nTerms =0;
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
					addTerm( polys[index], c, e);
				}
				
			}
			else if (command.equals("calc")){
				char name = kb.next().charAt(0);
				int index = find(name);
				if (index == -1){
					System.out.println("No such polynomial exists.");
				}
				else{
					int c = kb.nextInt();
					int e = kb.nextInt(); // 계수와 차수 입력받기
					addTerm( polys[index], c, e);
				}
				int x = kb.nextInt();
				int result = calcPolynomial(polys[index],x);
				System.out.println(result);
			}
			else if (command.equals("print")){
				char name = kb.next().charAt(0);
				int index = find(name);
				if (index == -1){
					System.out.println("No such polynomial exists.");
				}
				else{
					printPolynomial( polys[index] );
				}
			}
			else if (command.equals("exit")){
				break;
			}
			
		}
		kb.close();
		
	}

	private static int calcPolynomial(Polynomial p, int x) 
	{
		int result = 0;
		for (int i=0; i<p.nTerms; i++)
			result += calcTerm(p.terms[i],x);
		return result;
	}

	private static int calcTerm(Term term, int x) 
	{
		return (int)(term.coef * Math.pow( x, term.expo)) ; //지수함수 계산
	}

	private static void printPolynomial(Polynomial p) 
	{
		for (int i=0; i < p.nTerms; i++ ){
			printTerms(p.terms[i]);
			System.out.print("+");
		}
		System.out.println();
	}

	private static void printTerms(Term term) 
	{
		System.out.print(term.coef + "x^" + term.expo);
	}

	private static void addTerm(Polynomial p, int c, int e) 
	{ // 다항식 p에 cx^e추가
		int index = findTerm(p,e); // 다항식 p에 e차항이 있는지 확인하는 함수
		if (index != -1){
			p.terms[index].coef +=c; //-5x^3 + 5x^3  인 경우가 있다. 그부분은 일단 제외
		}
		else{
			int i = p.nTerms-1;//맨 마지막 항
			while(i >=0 && p.terms[i].expo <e){ //추가하려는 항의차수 e보다 작다면
				p.terms[i+1] = p.terms[i];
				i--;
			}
			p.terms[i+1] = new Term();
			p.terms[i+1].coef = c;
			p.terms[i+1].expo = e;
			p.nTerms++;
		}
	}

	private static int findTerm(Polynomial p, int e) 
	{
		for (int i =0; i<p.nTerms && p.terms[i].expo >=e; i++)
			if (p.terms[i].expo ==e)
				return i;
		return 0;
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
