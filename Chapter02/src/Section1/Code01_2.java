package Section1;

public class Code01_2 {

	public static void main(String[] args) {

		Person1 first; //Ŭ���� ���������� �ϳ��� Ÿ��ó�� ������ �� �ִ�
		first = new Person1(); //�迭ó�� �����ؾ��� ��ü ����
		first.name =  "john"; 
	    first.number = "01246323"; //Person1 Ÿ���� first��� ������ �̸��� ��ȭ��ȣ�� �����ϴ� ��
	    System.out.println("Name: " + first.name + ", Number: " + first.number);
	    
	    Person1 second = first; //first�� second ��� john��ü�� ���������� �����ϰ� �Ǵ°�
	    second.name = "Tom";
	    
	    Person1 [] members = new Person1[100]; //�迭�� �� ĭ�� ���������� �ȴ�.
	    members[0] = first;
	    members[1] = second;
	    System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
	    System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
	    
	    members[2]= new Person1();
	    members[2].name="David";
	    members[2].number ="123123";
	    System.out.println("Name: " + members[2].name + ", Number: " + members[2].number);
	    
	}

}
