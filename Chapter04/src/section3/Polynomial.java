package section3;

import java.util.Iterator;

public class Polynomial { 
	// interface와 implement의 분리!
	public char name;
	public MySingleLinkedList<Term> terms; 
	
	public Polynomial( char name ){
		this.name = name;
		terms = new MySingleLinkedList<Term>(); 
	}
	
	public void addTerm( int coef, int expo ){ 
		if (coef == 0) 
			return;
//		Node<Term> p = terms.head, q = null; //Node타입의 p객체를 생성할 수 없음
//		while (p!=null && p.data.expo > expo){ 
//			q = p;
//			p = p.next; 
//		}
//		if ( p != null && p.data.expo == expo){
//			p.data.coef += coef;
//			if (p.data.coef == 0){
//				if ( q == null)
//					terms.removeFirst();
//				else
//					terms.removeAfter(q); 
//			}
//		}
//		else { 
//			Term t = new Term( coef,expo );
//			if (q == null )
//				terms.addFirst( t ); 
//			else
//				terms.addAfter(q, t); 
//		}
	}
	
	public int calc( int x ){
		int result = 0;

//		Node<Term> p = terms.head;
//		while ( p != null ){
//			result += p.data.calc( x );
//			p = p.next;
//		}
		Iterator<Term> iter = terms.iterator();
		while(iter.hasNext()){ // 연결리스트 끝에 도달하면 false를 반환
			Term t = iter.next();//현재 가리키고 있는 노드에 저장된 데이터를 리턴해주고 자신은 한칸 앞으로 전진
			result += t.calc(x);
		} 
		return result;
	}
	public String toString(){
		String result = "";
//		Node<Term> p = terms.head;
//		while ( p != null ){
//			result += ("+" + p.data.toString());\
//			p = p.next;
//		}
		return result;
	}

}
