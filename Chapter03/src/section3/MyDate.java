package section3;

public class MyDate {
	public int year;
	public int month;
	public int day;
	
	public MyDate(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	
	
	//�ΰ��� ��¥�� ���ϴ� �޼ҵ带 ��������
	public int compareTo( MyDate other ){ //�ڱ��ڽŰ� �ٸ� ��¥�� ��
		if( year < other.year || year == other.year && month < other.month 
				|| year == other.year && month == other.month && day < other.day )
			return -1;
		else if( year > other.year || year == other.year && month >other.month 
				|| year == other.year && month == other.month && day > other.day )
			return 1;
		else
			return 0;
			
	}
	
	public String toString()
	{
		return year + "/" + month + "/" + day;
	}
}