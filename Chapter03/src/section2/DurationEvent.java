package section2;

import section3.MyDate;

public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;
	
	public DurationEvent( String title, MyDate b, MyDate e)// 持失切 持失
	{
		super(title);
	    begin = b;
		end = e;
	}
	public String toString()
	{
		return title + ", " + begin.toString() + "~" + end.toString();
	}

}
