package Section1;

public class Code01 {

	public static void main(String[] args) {

		Person1 first; //Ŭ���� ���������� �ϳ��� Ÿ��ó�� ������ �� �ִ�
		first = new Person1(); //�迭ó�� �����ؾ��� ��ü ����
		
		first.name =  "john"; 
	    first.number = "01246323"; //Person1 Ÿ���� first��� ������ �̸��� ��ȭ��ȣ�� �����ϴ� ��
	    System.out.println("Name: " + first.name + ", Number: " + first.number);
	    
	    Person1 [] members = new Person1[100]; //�迭 ���� ����
	    members[0] = first;
	    members[1] = new Person1();
	    members[1].name = "David";
	    members[1].number= "21123214";
	    System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
	    
	}

}