package section3;

import section2.MyDate;

public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;
	
	public DurationEvent( String title, MyDate b, MyDate e)// 생성자 생성
	{
		super(title);
	    begin = b;
		end = e;
	}
	
	public boolean isRelevant( MyDate date){ //이벤트가 이 날짜에 걸리는지를 알아내는 함수  begin <= date <= end
		
		
		return false;
	}
	
	public String toString()
	{
		return title + ", " + begin.toString() + "~" + end.toString();
	}

}
