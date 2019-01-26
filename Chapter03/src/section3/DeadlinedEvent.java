package section3;

import section2.MyDate;

public class DeadlinedEvent extends Event {
	public String title;
	public MyDate deadline;
	
	public DeadlinedEvent ( String title, MyDate date) //������ ����
	{
		super(title);
		this.deadline = date;
	}
	
	public boolean isRelevant( MyDate date){ //�̺�Ʈ�� �� ��¥�� �ɸ������� �˾Ƴ��� �Լ�
		return false;
	}
	
	public String toString()
	{
		return title + ", " + deadline.toString();
	}

}