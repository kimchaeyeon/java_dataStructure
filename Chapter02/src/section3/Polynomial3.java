package section3;
// 하나의 다항식을 표현하기 위한 클래스
public class Polynomial3 {
	public char name; 
	public Term3 [] terms; // 다항식을 구성하는 항들을 저장할 배열
	public int nTerms; // 다항식을 구성하는 항의 개수
	
	public Polynomial3()
	{
		nTerms = 0;
		terms = new Term3 [100]; // 객체를 생성
	}
	
	public Polynomial3 (char name)
	{
		this.name = name; // this.name 은 위에있는 name
		nTerms = 0;
		terms = new Term3 [100];
	}
	
	public void addTerm( int c, int e ) 
	{ // 다항식 p에 c x^e추가
	 	int index = findTerm(e); // 다항식 p에 e차항이 있는지 확인하는 함수
		if (index != -1){
			terms[index].coef +=c; //-5x^3 + 5x^3  인 경우가 있다. 그부분은 일단 제외
		}
		else{
			int i = nTerms-1;//맨 마지막 항
			while(i >=0 && terms[i].getExpo()<e){ //추가하려는 항의차수 e보다 작다면
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term3(c,e);
			//terms[i+1].coef = c;   Term3 생성자가 해주기 때문에 두 줄은 없어질 수 있다.
			//terms[i+1].expo = e;
			nTerms++;
		}
	}

	public int findTerm( int e) 
	{
		for (int i =0; i<nTerms && terms[i].getExpo() >=e; i++)
			if (terms[i].getExpo() ==e)
				return i;
		return 0;
	}
	
	public int calcPolynomial(int x) 
	{
		int result = 0;
		for (int i=0; i<nTerms; i++)
			result += terms[i].calcTerm(x);
		return result;
	}


	public void printPolynomial() 
	{
		for (int i=0; i < nTerms; i++ ){
			terms[i].printTerms();
			System.out.print("+");
		}
		System.out.println();
	}
}
