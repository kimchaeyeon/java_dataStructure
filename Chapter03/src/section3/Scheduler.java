package section3;

import java.util.Scanner;

import section2.MyDate;

public class Scheduler {
// ����ڰ� �Է��� �̺�Ʈ���� �� �ٸ� Ÿ���̴�. ��� �����ؾ����� �����غ��� ���� �߿��� ���α׷�!
// �迭�� ���� Ÿ�Ը� ������ �� �ִ�. 
// �����ϰ� �����غ��� �̺�Ʈ 3���� ���� 3���� �迭�� �����, 3���� ������ ���� ������ �� �ִ�.
// Ŭ�������� ��Ӱ��踦(���⼺)�� �� �̿��Ͽ� �����ϰ� �� ǥ���غ���
// �������� ������ is-a ����� �ƴϴ�, �׷��� �׷��� ������ �������� ã�Ƽ� �θ� Ŭ������ ������
// �̷��� �ϸ� �� ������ �̺�Ʈ���� ������ Ÿ���� �ƴ� ���������� �̺�Ʈ Ŭ������ ����Ŭ������ ������ �ڽĵ��̴�.
// �ϳ��� �迭�� �� �̺�Ʈ���� ������ �� �ִ�.
// �迭�� Ÿ���� Event Ÿ���� �Ǵ°�!
	private int capacity = 10;
	public Event[] events = new Event[capacity];
	public int n = 0;
	private Scanner kb;
	// ����Ŭ���� Ÿ���� ��ü�� ���� Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�!! �߿��߿� OneDayEventŸ���� ��ü�� ������ �� �ִ�.
		
	public void processCommand()
	{
		kb = new Scanner( System.in );
		while(true){
			System.out.print("$ ");
			String command = kb.next();
			if ( command.equals("addevent")){ // ����� �̺�Ʈ(�ҷ���)��� ������ �� �ΰ�.
				String type = kb.next(); // �ϳ��� ���ڿ��� �Է¹����� oneday,duration�̰ų� �� ���� �ذ�
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
			// test if events[i] is relevant to the date, then print it, i���� �̺�Ʈ�� �� ��¥�� �ɸ��� �̺�Ʈ�� ����Ʈ�Ѵ�.
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
		events[n++] = ev; // onedayEventŸ���� ��ü�� events Ÿ���� ��ü�� �����ϵ��� 
	}

	private void reallocate() {
		Event [] tmp = new Event [capacity * 2];
		for ( int i=0; i<n; i++)
			tmp[i] = events[i];
		events = tmp;
		capacity *=2;
	}

	private MyDate parseDateString(String dateString) {//dateString = "2017/1/20" ���ڿ��� ��� �����ϰ� �ɰ���
		String [] tokens = dateString.split("/");
		// tokens[0] = "2017" ���ڿ��� ������ �ٲپ���� ��
		int year = Integer.parseInt(tokens[0]); 
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate( year, month, day);
		return d;
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();// �����Լ��� �����ϰ� �ִ� Ŭ������ ��ü�� �����ϰ� ,
		app.processCommand();
	}

}