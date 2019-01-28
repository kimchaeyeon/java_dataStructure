package section5;

import java.util.Arrays;

public class MyArrayList<E> { // E라는 가상의 데이터 타입으로 parameterized된 클래스
	// 먼저 자료구조(변수)들을 생각하며 코드를 짠다. 
	private static final int INIT_CAPACITY = 10;
	private E [] theData;    // E타입의 배열, 생성자 안에서 배열을 생성해보도록 하겠음
	private int size;        // 이 배열에 저장될 데이터의 개수
	private int capacity;  // 배열의 크기
	
	public MyArrayList(){ // 생성자를 만들고 배열을 생성하고 초기화등을 해준다.
		theData = (E []) new Object [INIT_CAPACITY];// 배열 생성, new 뒤에 실제로 존재하지 않는 타입명이 들어가면 안된다. 
		size = 0;                                    // 그래서 E타입의 배열을 생성할 수가 없다. 모든 타입을 저장할 수 있는 Object타입의 배열을 생성을 하고 E로 타입변환을 해줘야 문법적으로 맞게 됨
		capacity = INIT_CAPACITY;
	}
	
	public void add(int index, E anEntry) { // 매개변수를 두개 받는 add메소드 생성
    //배열에 index번째 위치에 데이터를 추가하려면, 데이터를 뒤쪽으로 shift를 하고 데이터를 추가해야함
		if (index < 0 || index > size) //유효하지 않은 인덱스가 입력으로 들어올때 처리 error or exception
			throw new ArrayIndexOutOfBoundsException(index); //처리할 수 있는 클래스다.
		    //throw는 오류가 날때 exception을 던져주는 역할을 한다. try catch문에
		if (size >= capacity) // 데이터를 더 많이 넣어줘야하면 배열을 새로 생성해야함
			reallocate();
		for ( int i=size-1; i>=index; i--)
			theData[i+1] = theData[i]; // 데이터를 뒤로 한칸씩 보내기
		theData[index] = anEntry; // 원하는 위치에 앤트리를 추가해주기
		size++; //데이터의 개수 증가
	}
	private void reallocate() { // 배열의 크기를 2배 크게 새로 만들고, 원래 배열의 데이터를 옮겨야함
		//E [] tmp = (E []) new Object [capacity * 2]; <- for문 사용할 때 필요
		//1번째 방법읍 for문 ,2번째 방법은  Arrays.copyOf 함수 사용
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
	}

	public void add(E enEntry) { // 매개변수를 한개 가지는 메소드
		add(size, enEntry); // 맨  뒤에 삽입하라
	}
	
	public int size() //  데이터의 개수를 리턴해주는 메소드
	{
		return size;
	}
	public int indexOf( E anEntry ){ //하나의 데이터를 받아서 이 데이터가 리스트안에 있는지 검사하는 메소드
		for( int i=0; i<size; i++)
			if( theData[i].equals(anEntry)) // 클래스 E가 equals메소드를 가지고 있다. 이 메소드가 Object 클래스 안에 존재하는 메소드이기 때문에.. 가상 클래스라도 가능하다.
				return i; // indexOf 메서드가 의도한 대로 작동하려면 클래스 E는 equals 메서드를 오버라이딩 해야한다.
		return -1;
	}
	public E get(int index) {
		if(index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		return theData[index];
	}
    public E set(int index, E newValue) { //리턴 타입이 E이다. 
    	if(index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		E oldValue = theData[index];
		theData[index] = newValue; //문제가 없다면 새로운 값을 추가
		return oldValue;
	}
    public E remove(int index) {  
    	if(index < 0 || index >= size) // 데이터를 지워버리면 중간에 없는 데이터가 생기기 때문에
			throw new ArrayIndexOutOfBoundsException(index);
		E returnValue = theData[index];
		for(int i=index+1; i<size; i++) // for문을 이용하여 데이터를 하나씩 당겨준다
			theData[i-1] = theData[i];
		size--;
		return returnValue;
	}
    
	
	public static void main(String [] args){
		MyArrayList<String> test = new MyArrayList<>();
		
		try{
			test.add(1,"Hello");// 아직 생성된 데이터가 없어서 1번위치에 생성할 수 없다, 0번위치에 생성해야함
		}
		catch( ArrayIndexOutOfBoundsException e ){
			System.out.println("---");
		}
		System.out.println("++++");
	}
}
