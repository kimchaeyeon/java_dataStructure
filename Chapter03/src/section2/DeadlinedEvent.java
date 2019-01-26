package section2;

import section3.MyDate;

public class DeadlinedEvent extends Event {
	public String title;
	public MyDate deadline;
	
	public DeadlinedEvent ( String title, MyDate date) //������ ����
	{
		super(title);
		this.deadline = date;
	}
	public String toString()
	{
		return title + ", " + deadline.toString();
	}

}
