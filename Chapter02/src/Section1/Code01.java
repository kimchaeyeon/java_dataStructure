package Section1;

public class Code01 {

	public static void main(String[] args) {

		Person1 first; //클래스 선언이지만 하나의 타입처럼 선언할 수 있다
		first = new Person1(); //배열처럼 생성해야함 객체 생성
		
		first.name =  "john"; 
	    first.number = "01246323"; //Person1 타입의 first라는 변수에 이름과 전화번호를 저장하는 것
	    System.out.println("Name: " + first.name + ", Number: " + first.number);
	    
	    Person1 [] members = new Person1[100]; //배열 선언도 가능
	    members[0] = first;
	    members[1] = new Person1();
	    members[1].name = "David";
	    members[1].number= "21123214";
	    System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
	    
	}

}
