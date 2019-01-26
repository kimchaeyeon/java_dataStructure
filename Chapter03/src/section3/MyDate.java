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
	
	
	//두개의 날짜를 비교하는 메소드를 만들어놓기
	public int compareTo( MyDate other ){ //자기자신과 다른 날짜를 비교
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
