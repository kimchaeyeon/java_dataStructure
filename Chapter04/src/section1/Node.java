package section1;

public class Node<T> { //������ ���� Ÿ�� T
	public T data; //TŸ�� ������
	public Node<T> next;//TŸ���� ���, ���ϰ� �Ȱ��� Ÿ���� ������ �� �ִ� ��忩����
	
	public Node(T item){ //������ Node Node�� ����� �����͸� �޾� �����ڸ� ����
		data = item;
		next = null;
	}

}
