package section3;

public abstract class Event implements Comparable{ //추상클래스로 만들어주면 이벤트 객체는 만들지 않음
	
	public String title;
	public Event(String title){
		this.title = title;
	}
	//public String toString(){
	//	return "Title: " + title;
	//}
	
	public abstract boolean isRelevant(MyDate date);
	public abstract MyDate getRepresentativeDate();
	
	public int compareTo(Object other){
		MyDate mine = getRepresentativeDate();
		MyDate yours = ((Event)other).getRepresentativeDate();
		return mine.compareTo(yours);
	}
}