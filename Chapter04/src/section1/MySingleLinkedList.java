package section1;

public class MySingleLinkedList<T> { // 단방향 링크드리스트, 반대로 각각의 노드가 자기 이전,다음 노드의 주소를 동시에 가지는 구조의 연결리스트는 더블링크드리스트,
	
	public Node<T> head; // 첫번째 노드의 주소, T타입
	public int size;
	
	public MySingleLinkedList(){// 생성자
		head = null;
		size = 0;
	}
	public void addFisrt( T item ){ //새로운 노드 데이터를 연결리스트 맨 앞에 추가하는 메소드 
        //새로운 노드를 만들고 추가할 데이터를 저장
		Node<T> temp = new Node<T>(item); // 노드 클래스의 생성자가 매개변수를 하나 받아야 하기 떄문에 오류
		// T타입을 parameter로 가지는 다른 객체를 생성하는것은 가능,, T : type parameter 를 포함하는 새로운 객체를 생성할 때,
		//T타입의 객체를 생성할 순 없다. 실제 존재 클래스가 아니라 가상이기 때문에 , 그렇기 때문에 T타입 배열도 생성이 불가능
		// Node<T> [] arr = new Node<T>[100]; 도 불가능 
		temp.next = head;   //새로운 노드의 next필드가 현재의 head노드를 가리키도록
		head = temp;        //새로운 노드를 새로운 head노드로 한다. 
		size++;                
		// 기존의 리스트의 크기가 0인경우, 즉 head가 null인 경우도 문제가 없는지 확인해야한다
	} // 주의할 점! 일반적인 경우 말고도 특수,극단적인 경우에도 문제 없이 작동하는지 철저히 확인해야한다
	public void addAfter( Node<T> before, T item){ // 한 노드의 주소를 받아서 before 가리키는 노드 뒤에 데이터를 끼워넣기
		Node<T> temp = new Node<T>( item );// 새로운 노드를 만들고 데이터를 저장
		temp.next = before.next;// 새로운 노드의 next필드의 before의 다음 노드를 가리키도록 
		before.next = temp;// 새로운 노드를 before의 다음 노드로 만든다
		size++;
		}
	
	// 단순 연결리스트에 새로운 노드를 삽입할 때 삽입할 위치의 바로 앞 노드의 주소가 필요하다. 
	// 즉 어떤 노드의 뒤에 삽입하는 것은 간단하지만, 반대로 어떤 노드의 앞에 삽입하는 것은 간단하지 않다.
	
	public T removeFirst(){ //연결리스트의 첫번째 노드를 삭제한다. remove된 데이터가 가지고 있는 타입을 리턴 타입으로 지정해줘야 하기 때문에 T타입으로 생성
		if (head == null)
			return null; 
		else {//head가 null 아니라면 head가 현재 head노드의 다음 노드를 가리키게 만든다.
			T temp = head.data;//T타입의 임시 변수를 만들어 head의 데이터를 temp에 저장한다.
			head= head.next;
			size--;
			return temp;
		}
	}
	public T removeAfter( Node<T> before ){ //before가 가리키는 노드의 다음 노드를 삭제한다. 
		if ( before.next == null)
			return null;
		else {  // before의 다음 노드가 null이 아니라면 before의 next필드가 현재 next노드의 다음 노드를 가리키게 만든다.
			T temp = before.next.data;
			before.next = before.next.next;
			size--;
			return temp;
			}
		}
	// 단순연결리스트에 어떤 노드를 삭제할 때는 삭제할 노드의 바로 앞 노드의 주소가 필요하다. 삭제할 노드의 주소만으로는 삭제할 수 없다.
	public void add( int index, T item )// insert  , arrayList메소드와 유사한 메소드들을 생성
	{
		
	}
	public void remove( int index ) // delete
	{
		
	}
	public T get(int index){
		
		return null;
	}
	public int indexOf( T item ) // search
	{
		return -1;
	}

	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>(); //String 타입 객체 생성
		
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday"); // M,S,F
		list.add(2, "Tuesday"); // M,S,T,F
		
		String str = list.get(2); //str = "Tuesday";
		list.remove(2);  //M,S,F
		int pos = list.indexOf("Friday"); // pos = 2

	}

}
