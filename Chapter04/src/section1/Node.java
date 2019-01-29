package section1;

public class Node<T> { //임의의 가상 타입 T
	public T data; //T타입 데이터
	public Node<T> next;//T타입의 노드, 나하고 똑같은 타입을 참조할 수 있는 노드여야함
	
	public Node(T item){ //생성자 Node Node에 저장될 데이터를 받아 생성자를 만듬
		data = item;
		next = null;
	}

}
