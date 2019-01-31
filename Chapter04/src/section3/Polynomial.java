package section3;

public class Polynomial { // 다항식의 이름(f,g..), 
	
	public char name;
	public MySingleLinkedList<Term> terms; //다른 패키지에 있는 클래스이기 때문에 임포트 해줘야한다.
	
	public Polynomial( char name ){ //생성자
		this.name = name;
		terms = new MySingleLinkedList<Term>(); // 생성자 밖에서도 생성해줘도 된다.
	}
	
	public void addTerm( int coef, int expo ){ // 기존의 다항식에 새로운 항 coef*Xexpo^를 추가하라 ,
	// 차수에 관한 내림차순으로 정렬되어 있다고 가정
	// 추가하려는 항과 동일 차수의 항이 이미 있는 경우 : 기존 항의 계수만 변경 (0이 되버리는 경우는 삭제하는 기능까지 추가)
	// 그렇지 않은 경우 : 새로운 항을 삽입( 항들은 차수의 내림차순으로 항상 정렬 됨 ), 위치를 찾기 위해서는 새로운 항보다 차수가 작거나 같은 항이 나올때 까지 첫번째 항부터 순서대로 검사해야 한다.
    // 연결리스트에서 노드를 삽입하기 위해서는 이 앞 노드의 주소가 필요하다. 그래서 두 개의 변수 p,q가 필요하다.
		if (coef == 0) // 계수가 0이면
			return;
		Node<Term> p = terms.head, q = null; //p가 첫번째 노드(MySingleLinkedList객체 안에 head)를 가리키도록, Node도 다른 패키지에 있는 클래스라서 임포트 해줘야함
		while (p!=null && p.data.expo > expo){ //p가 가리키고 있는 노드(term)의 데이터의 차수가 추가하려는 차수보다 큰 경우에만 
			q = p;
			p = p.next; //q뒤에 삽입하면 된다.
		}
		if ( p != null && p.data.expo == expo){//while문을 빠져나오면 p의 차수가 삽입하려는 차수와 같거나 작은경우가 나오게 됨
			p.data.coef += coef;
			if (p.data.coef == 0){//계산했더니 0이 되버리는 경우에는 항을 삭제해줘야 한다.
				// remove this node p
				// 삭제하기 위해서는 p의 앞 노드가 필요함, q를 이용해서 알 수 있다
				if ( q == null)
					terms.removeFirst();
				else
					terms.removeAfter(q); 
			}
		}
		else { // add after q
			Term t = new Term( coef,expo );//새로운 항을 만들어줘야함
			if (q == null )
				terms.addFirst( t ); // 맨 앞에 추가
			else
				terms.addAfter(q, t); //q가 가리키고 있는 노드 뒤에 t를 데이터를 가지고 있는 노드를 추가하라
		}
	}
	
	public int calc( int x ){//변수 x의 값을 매개변수로 받아서 이 다항식의 전체 값(각각의 항을)을 계산하여 리턴
		int result = 0;
		// 연결리스트를 순회하면서
		Node<Term> p = terms.head;
		while ( p != null ){
			result += p.data.calc( x );//그 노드의 항의 값을 계산
			p = p.next;
		}
		return result;
	}
	public String toString(){//다항식에 대해서 toString 메소드
		String result = "";
		Node<Term> p = terms.head;
		while ( p != null ){
			result += ("+" + p.data.toString());//그 노드의 항의 값을 계산
			p = p.next;
		}
		return result;
	}

}
