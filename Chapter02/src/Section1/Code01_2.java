package Section1;

public class Code01_2 {

	public static void main(String[] args) {

		Person1 first; //클래스 선언이지만 하나의 타입처럼 선언할 수 있다
		first = new Person1(); //배열처럼 생성해야함 객체 생성
		first.name =  "john"; 
	    first.number = "01246323"; //Person1 타입의 first라는 변수에 이름과 전화번호를 저장하는 것
	    System.out.println("Name: " + first.name + ", Number: " + first.number);
	    
	    Person1 second = first; //first와 second 모두 john객체를 참조변수로 저장하게 되는것
	    second.name = "Tom";
	    
	    Person1 [] members = new Person1[100]; //배열의 각 칸도 참조변수가 된다.
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
