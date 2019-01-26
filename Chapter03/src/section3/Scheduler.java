package section3;

import java.util.Scanner;

import section2.MyDate;

public class Scheduler {
// 사용자가 입력한 이벤트들이 다 다른 타입이다. 어떻게 저장해야할지 생각해보는 것이 중요한 프로그램!
// 배열은 같은 타입만 저장할 수 있다. 
// 간단하게 생각해보면 이벤트 3개에 따른 3개의 배열을 만들고, 3개의 변수를 만들어서 저장할 수 있다.
// 클래스들의 상속관계를(다향성)을 잘 이용하여 간단하게 잘 표현해보기
// 연관성은 높지만 is-a 관계는 아니다, 그럴땐 그래도 각각의 공통점을 찾아서 부모 클래스를 만들자
// 이렇게 하면 세 종류의 이벤트들이 별개의 타입이 아닌 공통점으로 이벤트 클래스를 수퍼클래스를 가지는 자식들이다.
// 하나의 배열의 그 이벤트들을 저장할 수 있다.
// 배열의 타입이 Event 타입이 되는것!
	private int capacity = 10;
	public Event[] events = new Event[capacity];
	public int n = 0;
	private Scanner kb;
	// 수퍼클래스 타입의 객체는 서브 클래스 타입의 객체를 참조할 수 있다!! 중요중요 OneDayEvent타입의 객체를 참조할 수 있다.
		
	public void processCommand()
	{
		kb = new Scanner( System.in );
		while(true){
			System.out.print("$ ");
			String command = kb.next();
			if ( command.equals("addevent")){ // 사용한 이벤트(불러온)어디에 저장할 것 인가.
				String type = kb.next(); // 하나의 문자열을 입력받으면 oneday,duration이거나 등등에 따라서 해결
				if (type.equalsIgnoreCase("oneday")){
					handleAddOneDayEvent();
				}
				else if (type.equalsIgnoreCase("duration")){
					handleAddDurationEvent();
				}
				else if (type.equalsIgnoreCase("deadline")){
					handleAddDeadlinedEvent();
				}
			}
			else if( command.equals("list")){
				handleList();
			}
			else if( command.equals("show")){
				handleShow();
			}
			else if( command.equals("exit"))
				break;
		}
		kb.close();
	}
	
	private void handleShow() {
		String dateString = kb.next();
		MyDate theDate = parseDateString( dateString );
		for (int i=0; i<n; i++){
			// test if events[i] is relevant to the date, then print it, i번쨰 이벤트가 이 날짜에 걸리면 이벤트를 프린트한다.
			//if (events[i].isRelevant( theDate ) )
				//System.out.println(events[i].toString());
		}
	}

	private void handleList() {
		for (int i =0; i<n; i++)
			System.out.println("   " + events[i].toString() );
	}

	private void handleAddDeadlinedEvent() {
	}

	private void handleAddDurationEvent() {
	}

	private void handleAddOneDayEvent() {
		System.out.print("  when: ");
		String dateString = kb.next(); 
		
		System.out.print("  title: ");
		String title = kb.next();

		MyDate date = parseDateString( dateString );
		
		OneDayEvent ev = new OneDayEvent( title , date);
		//System.out.println( ev.toString());
		addEvent(ev);
		
	}

	private void addEvent(OneDayEvent ev) {
		if ( n >= capacity)
			reallocate();
		events[n++] = ev; // onedayEvent타입의 객체를 events 타입의 객체를 참조하도록 
	}

	private void reallocate() {
		Event [] tmp = new Event [capacity * 2];
		for ( int i=0; i<n; i++)
			tmp[i] = events[i];
		events = tmp;
		capacity *=2;
	}

	private MyDate parseDateString(String dateString) {//dateString = "2017/1/20" 문자열을 어떻게 적절하게 쪼갤까
		String [] tokens = dateString.split("/");
		// tokens[0] = "2017" 문자열임 정수로 바꾸어줘야 함
		int year = Integer.parseInt(tokens[0]); 
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate( year, month, day);
		return d;
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();// 메인함수를 포함하고 있는 클래스의 객체를 생성하고 ,
		app.processCommand();
	}

}
