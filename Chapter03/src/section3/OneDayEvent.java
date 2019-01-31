package section3;

import section2.MyDate;

public class OneDayEvent extends Event{
	
	public MyDate date;
	
	public OneDayEvent( String title, MyDate date) //생성자 생성
	{
		super(title);
		this.date = date;
	}
	
	public boolean isRelevant( MyDate date){ //이벤트가 이 날짜에 걸리는지를 알아내는 함수
		return this.date.compareTo(date) == 0;
	}
	
	public String toString()
	{
		return title + ", " + date.toString();
	}
	public MyDate getRepresentativeDate(){
		return date;
	}
}
