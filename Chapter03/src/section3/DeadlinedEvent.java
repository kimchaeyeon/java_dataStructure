package section3;

import section2.MyDate;

public class DeadlinedEvent extends Event {
	public String title;
	public MyDate deadline;
	
	public DeadlinedEvent ( String title, MyDate date) //생성자 생성
	{
		super(title);
		this.deadline = date;
	}
	
	public boolean isRelevant( MyDate date){ //이벤트가 이 날짜에 걸리는지를 알아내는 함수
		return deadline.compareTo(date) >= 0;
	}
	
	public String toString()
	{
		return title + ", " + deadline.toString();
	}
	public MyDate getRepresentativeDate(){
		return deadline;
	}

}
