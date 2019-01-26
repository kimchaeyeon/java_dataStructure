package section3;

import section2.MyDate;

public class DurationEvent extends Event {
	public MyDate begin;
	public MyDate end;
	
	public DurationEvent( String title, MyDate b, MyDate e)// ������ ����
	{
		super(title);
	    begin = b;
		end = e;
	}
	
	public boolean isRelevant( MyDate date){ //�̺�Ʈ�� �� ��¥�� �ɸ������� �˾Ƴ��� �Լ�  begin <= date <= end
		
		
		return false;
	}
	
	public String toString()
	{
		return title + ", " + begin.toString() + "~" + end.toString();
	}

}