package section3;

import java.util.Iterator;

public class MySingleLinkedList<T> { // �ܹ��� ��ũ�帮��Ʈ, �ݴ�� ������ ��尡 �ڱ� ����,���� ����� �ּҸ� ���ÿ� ������ ������ ���Ḯ��Ʈ�� ������ũ�帮��Ʈ,
	
	private Node<T> head; // ù��° ����� �ּ�, TŸ��
	private int size;
	
	public MySingleLinkedList(){// ������
		head = null;
		size = 0;
	}
	//inner class Ŭ���� �ȿ� Ŭ���� �ִ� ��
	//���Ḯ��Ʈ�� ������� ��� Ŭ������ �ʿ��ϴ�. Ŭ�����ȿ� Ŭ������ ����� ��带 �ܺο��� ����ϰ� �������� ���ϰ� �����.
	private static class Node<T> { //������ ���� Ÿ�� T
		public T data; //TŸ�� ������
		public Node<T> next;//TŸ���� ���, ���ϰ� �Ȱ��� Ÿ���� ������ �� �ִ� ��忩����
		
		public Node(T item){ //������ Node Node�� ����� �����͸� �޾� �����ڸ� ����
			data = item;
			next = null;
		}
	}
	public Iterator<T> iterator() //���� �̱۸���Ʈ Ŭ������ iterator��� public �޼ҵ带 ������ �Ѵ�
	{
		return null;
	}
	private void addFirst( T item ){ //���ο� ��� �����͸� ���Ḯ��Ʈ �� �տ� �߰��ϴ� �޼ҵ� 
        //���ο� ��带 ����� �߰��� �����͸� ����
		Node<T> temp = new Node<T>(item); // ��� Ŭ������ �����ڰ� �Ű������� �ϳ� �޾ƾ� �ϱ� ������ ����
		// TŸ���� parameter�� ������ �ٸ� ��ü�� �����ϴ°��� ����,, T : type parameter �� �����ϴ� ���ο� ��ü�� ������ ��,
		//TŸ���� ��ü�� ������ �� ����. ���� ���� Ŭ������ �ƴ϶� �����̱� ������ , �׷��� ������ TŸ�� �迭�� ������ �Ұ���
		// Node<T> [] arr = new Node<T>[100]; �� �Ұ��� 
		temp.next = head;   //���ο� ����� next�ʵ尡 ������ head��带 ����Ű����
		head = temp;        //���ο� ��带 ���ο� head���� �Ѵ�. 
		size++;                
		// ������ ����Ʈ�� ũ�Ⱑ 0�ΰ��, �� head�� null�� ��쵵 ������ ������ Ȯ���ؾ��Ѵ�
	} // ������ ��! �Ϲ����� ��� ������ Ư��,�ش����� ��쿡�� ���� ���� �۵��ϴ��� ö���� Ȯ���ؾ��Ѵ�
	private void addAfter( Node<T> before, T item){ // �� ����� �ּҸ� �޾Ƽ� before ����Ű�� ��� �ڿ� �����͸� �����ֱ�
		Node<T> temp = new Node<T>( item );// ���ο� ��带 ����� �����͸� ����
		temp.next = before.next;// ���ο� ����� next�ʵ��� before�� ���� ��带 ����Ű���� 
		before.next = temp;// ���ο� ��带 before�� ���� ���� �����
		size++;
		}
	
	// �ܼ� ���Ḯ��Ʈ�� ���ο� ��带 ������ �� ������ ��ġ�� �ٷ� �� ����� �ּҰ� �ʿ��ϴ�. 
	// �� � ����� �ڿ� �����ϴ� ���� ����������, �ݴ�� � ����� �տ� �����ϴ� ���� �������� �ʴ�.
	
	private T removeFirst(){ //���Ḯ��Ʈ�� ù��° ��带 �����Ѵ�. remove�� �����Ͱ� ������ �ִ� Ÿ���� ���� Ÿ������ ��������� �ϱ� ������ TŸ������ ����
		if (head == null)
			return null; 
		else {//head�� null �ƴ϶�� head�� ���� head����� ���� ��带 ����Ű�� �����.
			T temp = head.data;//TŸ���� �ӽ� ������ ����� head�� �����͸� temp�� �����Ѵ�.
			head= head.next;
			size--;
			return temp;
		}
	}
	private T removeAfter( Node<T> before ){ //before�� ����Ű�� ����� ���� ��带 �����Ѵ�. 
		if ( before.next == null)
			return null;
		else {  // before�� ���� ��尡 null�� �ƴ϶�� before�� next�ʵ尡 ���� next����� ���� ��带 ����Ű�� �����.
			T temp = before.next.data;
			before.next = before.next.next;
			size--;
			return temp;
			}
		}
	
	
	
	public Node<T> getNode( int index ){ // ���Ḯ��Ʈ�� index��° ����� �ּҸ� ��ȯ���ִ� �޼ҵ�
		if(index<0 || index >= size)
			return null;
		Node<T> p = head; // p�� ù��° ��带 ����Ű����
		for ( int i =0; i<index; i++)
			p = p.next;
		return p; 
		//index��°���� ��ȸ�ϴ� �޼ҵ�
	}
	// �ܼ����Ḯ��Ʈ�� � ��带 ������ ���� ������ ����� �ٷ� �� ����� �ּҰ� �ʿ��ϴ�. ������ ����� �ּҸ����δ� ������ �� ����.
	public void add( int index, T item )// insert , ���Ḯ��Ʈ�� index��° ��ġ�� ���ο� �����͸� �����Ѵ�.
	{
		if( index < 0 || index > size )
			return;
		if( index == 0)
			addFirst( item );
		else{
			Node<T> q = getNode( index -1 );
			addAfter( q, item ); //index-1 �ڿ� ���ο� ��带 �߰��ϴ� ���̱� ������ �̷��� �Լ��� �ۼ��ص� �� index�� 0 �϶���?
		}
	}
	public T remove( int index ) // delete , index��° ��带 �����ϰ� , �� ��忡 ����� �����͸� ��ȯ�Ѵ�
	{// �� ��带 �����Ϸ��� �� ��������� �ּҸ� �˾ƾ��Ѵ�.
		if( index < 0 || index >= size )
			return null;
		if( index == 0 )
			return removeFirst();
		Node<T> prev = getNode( index-1 );
		return removeAfter( prev );
	}
	public T remove( T item ) { // �Էµ� ��Ʈ���� ������ ��带 ã�� �����Ѵ�. ������ ��忡 ����� ��Ʈ���� ��ȯ�Ѵ�.
		// ������ ��带 ã����, ������ ��带 �����ϱ� ���ؼ��� ������ ��尡 �ƴ϶� ���� ����� �ּҰ� �ʿ���
		// �������� �ΰ��� ����!
		Node<T> p = head;
		Node<T> q = null; // q�� �׻� p�� ���� ��带 ����Ŵ
		while( p!= null && !p.data.equals(item)){
			q = p;
			p = p.next;
		}
		if (p==null)//ã���ִ� ��尡 �������� �ʴ´ٴ� ��
			return null;
		if (q==null)
			return removeFirst();

		return removeAfter(q);
	}
	public T get(int index){ // index��° ��忡 ����� �����͸� ��ȯ�Ѵ�.
		if (index < 0 || index >= size)
			return null;  //index ��ȿ�� üũ
		return getNode(index).data; 
	
	}
	public int indexOf( T item ) // search ,���Ḯ��Ʈ�� ������ ó������ ������� �湮�ϴ� ���� ��ȸ(traverse)�Ѵٰ� ���Ѵ�.
	{// �� �޼��� �Էµ� ������ item�� ������ �����͸� ������ ��带 ã�Ƽ� �� ����ȣ��(index)��ȯ�Ѵ�. �װ��� ���ؼ� ���Ḯ��Ʈ�� ��ȸ�Ѵ�.
		Node<T> p = head;// p��� ���������� ����, ù��° ��带 ����Ű��
		int index = 0;
		while ( p != null ){
			if (p.data.equals(item)) //��� p�� ���ؼ� �ؾ� �� ���� �Ѵ�.
				return index;
			p=p.next;
			index++;
		} // while���� ���������� �Ǹ� ���� �������� �ʴ� ���̱� ������ -1�� �������ش�
		return -1;
	}
	public int size(){
		return size;
	}

	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>(); //String Ÿ�� ��ü ����
		
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday"); // M,S,F
		list.add(2, "Tuesday"); // M,S,T,F
		
		String str = list.get(2); //str = "Tuesday";
		list.remove(2);  //M,S,F
		int pos = list.indexOf("Friday"); // pos = 2

	}

}