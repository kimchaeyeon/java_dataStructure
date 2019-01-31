package section3;

import section2.MyDate;

public class OneDayEvent extends Event{
	
	public MyDate date;
	
	public OneDayEvent( String title, MyDate date) //������ ����
	{
		super(title);
		this.date = date;
	}
	
	public boolean isRelevant( MyDate date){ //�̺�Ʈ�� �� ��¥�� �ɸ������� �˾Ƴ��� �Լ�
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
