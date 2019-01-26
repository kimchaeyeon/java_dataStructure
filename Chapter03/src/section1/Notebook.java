package section1;

public class Notebook extends Computer{ //컴퓨터클래스의 모든 부분을 상속받는다, 부모클래스의  메소드타입이 private이면 자식클래스에서 사용할 수 없다. 이럴 떄 사용하는 타입이 protected
	
	public double screenSize;
	public double weight;
	
	public Notebook( String man, String proc, int ram, int disk, double speed, double screen, double weight){ //생성자 클래스의 맴버를 매개변수로 받아서 초기화하기
		super( man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}
	public String toString(){ // 객체의 값들을 하나의 문자열로 리턴해주는 함수 , 메소드 오버라이딩 해서 notebook클래스 용도에 맞게끔 수정했다.
		String result = super.toString() + //부모로부터 물려받은 메소드를 호출하고, 메소드를 오버라이딩한다
		                "\nScreen Size: " + screenSize + " inches" +
                        "\nWeight: " + weight + " kg";
		return result;
	}
	public static void main(String [] args){
		Computer test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2); //다형성,수퍼클래스 타입의 변수(참조변수)가 서브클래스 타입의 객체를 참조할 수 있다.
//      test 변수의 타입은 computer인데 실제로 변수가 참조하고 있는 객체는 notebook객체이다.

//      Computer test2 = new Computer("Dell", "i5", 4, 1000, 3.2);

/*		test.manufacturer = "Dell";
		test.processor = "i5";
		test.ramSize = 4;
		test.diskSize =1000;
		test.processorSpeed = 3.2;
		
		test.screenSize = 15.6;
		test.weight = 1.2;
*/
		
//      System.out.println( test.computePower() );
		System.out.println( test.toString() ); // static binding vs dynamic binding(win!!!)
		//변수의 타입이 아니라 실제 참조하고 있는 객체의 메소드를 호출하게 된다.
	}
}
