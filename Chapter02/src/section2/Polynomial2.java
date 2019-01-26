package section2;
// �ϳ��� ���׽��� ǥ���ϱ� ���� Ŭ����
public class Polynomial2 {
	public char name; 
	public Term2 [] terms; // ���׽��� �����ϴ� �׵��� ������ �迭
	public int nTerms =0; // ���׽��� �����ϴ� ���� ����
	
	public void addTerm( int c, int e ) 
	{ // ���׽� p�� c x^e�߰�
		int index = findTerm(e); // ���׽� p�� e������ �ִ��� Ȯ���ϴ� �Լ�
		if (index != -1){
			terms[index].coef +=c; //-5x^3 + 5x^3  �� ��찡 �ִ�. �׺κ��� �ϴ� ����
		}
		else{
			int i = nTerms-1;//�� ������ ��
			while(i >=0 && terms[i].expo <e){ //�߰��Ϸ��� �������� e���� �۴ٸ�
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term2();
			terms[i+1].coef = c;
			terms[i+1].expo = e;
			nTerms++;
		}
	}

	public int findTerm( int e) 
	{
		for (int i =0; i<nTerms && terms[i].expo >=e; i++)
			if (terms[i].expo ==e)
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