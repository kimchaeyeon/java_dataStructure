package section4;

import java.util.Scanner;

public class ShapeApplication {

	private int capacity = 10;
	private Shape [] shapes = new Shape [capacity];
	private int n = 0; //저장될 개수
	private Scanner kb = new Scanner(System.in);
	// 메소드 밖에서 스케너 생성
	
	public void processCommand()
	{// 모든일들을 이 메소드가 한다.
		while(true){
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("add"))
				handleAdd();
			else if (command.equals("show")||command.equals("showdetail")) //쇼는 간단하게 출력, 쇼 디테일은 추가적으로 면적, 둘레 길이 등을 출력
				handleShow( command.equals("showdetail")); //함수 안에서 구분해줘야함 어떤 명령인지를
			else if (command.equals("sort"))
				bubbleSort(shapes, n);
			else if (command.equals("exit"))
				break;
		}
		kb.close();
	}
	
//	private void bubbleSort() { // 이 정렬 메서드는 오직 shape타입의 데이터들을 정렬하는 용도로만 사용가능하다.
//		                        // 즉 generic하지 않다. 만약 정수를 정렬하고싶다면 데이터 타입이 정수이기 때문에
//		                        // 또 다르게 버블정렬을 생성해야하고... 로직은 같지만..
//		                        // 코드의 재사용( reuse ) <-- 어떻게 가능하게 할까요
//		for ( int i=n-1; i>0; i--){
//			for( int j=0; j<i; j++){
//				if ( shapes[j].computeArea() > shapes[j+1].computeArea()){
//					Shape tmp = shapes[j];
//					shapes[j] = shapes[j+1];
//					shapes[j+1] = tmp;
//				}
//			}
//		}
//	}
	private void bubbleSort( MyComparable [] data, int size) { //Shape 타입이라 받지 않고 comparable 타입 데이터라고 매개변수를 받는다.
		for ( int i=size-1; i>0; i--){
			for( int j=0; j<i; j++){
				if ( data[j].compareTo(data[j+1]) > 0 ){
					MyComparable tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
					}
				}
			}
		} // 버블정렬을 generic하게 만든것임
	

	private void handleShow( boolean detailed ) { //명령 구분을 불린형으로 
		for (int i=0; i<n; i++){
			System.out.println((i+1)+". " + shapes[i].toString());
		    if (detailed){ //참이면 showdetail 명령이기 때문에 추가적인 정보를 보여줘야함
		    	System.out.println("   The area is " + shapes[i].computeArea());
		    	System.out.println("   The Perimeter is " + shapes[i].computePerimeter());
		    }
		}
	}
		

	private void handleAdd() {
		String type = kb.next();
		switch(type) { //자바에서 문자열에 대해 스위치문을 사용할 수 있게 기능이 추가되었음 type
		case "R":
			int w = kb.nextInt();// 키보드로 입력받고
			int h = kb.nextInt();
			Rectangle r = new Rectangle(w,h); //객체 생성
			addShape( r ); // 객체를 add 하기
			break;
		case "C":
			addShape( new Circle (kb.nextInt())); // 이런식으로 간추릴 수 있은
			break;
		case "T":
			// 일단 생략!
		}
	}

	private void addShape(Shape shape) { //다형성에 의해서 shape타입 변수를 선언해줘야함
		shapes[n++] = shape;
	}

	public static void main(String[] args){
// 이 메인 함수는shapeApplicatron 객체 생성을 하고, 객체 안에 있는 process command를 호출해주는 일을 한다
		ShapeApplication app = new ShapeApplication();
		app.processCommand();
		
	}
}
