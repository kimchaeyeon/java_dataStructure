package section4;

import java.util.Scanner;

public class ShapeApplication {

	private int capacity = 10;
	private Shape [] shapes = new Shape [capacity];
	private int n = 0; //����� ����
	private Scanner kb = new Scanner(System.in);
	// �޼ҵ� �ۿ��� ���ɳ� ����
	
	public void processCommand()
	{// ����ϵ��� �� �޼ҵ尡 �Ѵ�.
		while(true){
			System.out.print("$ ");
			String command = kb.next();
			if (command.equals("add"))
				handleAdd();
			else if (command.equals("show")||command.equals("showdetail")) //��� �����ϰ� ���, �� �������� �߰������� ����, �ѷ� ���� ���� ���
				handleShow( command.equals("showdetail")); //�Լ� �ȿ��� ����������� � ���������
			else if (command.equals("sort"))
				bubbleSort(shapes, n);
			else if (command.equals("exit"))
				break;
		}
		kb.close();
	}
	
//	private void bubbleSort() { // �� ���� �޼���� ���� shapeŸ���� �����͵��� �����ϴ� �뵵�θ� ��밡���ϴ�.
//		                        // �� generic���� �ʴ�. ���� ������ �����ϰ�ʹٸ� ������ Ÿ���� �����̱� ������
//		                        // �� �ٸ��� ���������� �����ؾ��ϰ�... ������ ������..
//		                        // �ڵ��� ����( reuse ) <-- ��� �����ϰ� �ұ��
//		for ( int i=n-1; i>0; i--){
//			for( int j=0; j<i; j++){
//				if ( shapes[j].computeArea() > shapes[j+1].computeArea()){
//					Shape tmp = shapes[j];
//					shapes[j] = shapes[j+1];
//					shapes[j+1] = tmp;
//				}
//			}
//		}
//	}
	private void bubbleSort( MyComparable [] data, int size) { //Shape Ÿ���̶� ���� �ʰ� comparable Ÿ�� �����Ͷ�� �Ű������� �޴´�.
		for ( int i=size-1; i>0; i--){
			for( int j=0; j<i; j++){
				if ( data[j].compareTo(data[j+1]) > 0 ){
					MyComparable tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
					}
				}
			}
		} // ���������� generic�ϰ� �������
	

	private void handleShow( boolean detailed ) { //��� ������ �Ҹ������� 
		for (int i=0; i<n; i++){
			System.out.println((i+1)+". " + shapes[i].toString());
		    if (detailed){ //���̸� showdetail ����̱� ������ �߰����� ������ ���������
		    	System.out.println("   The area is " + shapes[i].computeArea());
		    	System.out.println("   The Perimeter is " + shapes[i].computePerimeter());
		    }
		}
	}
		

	private void handleAdd() {
		String type = kb.next();
		switch(type) { //�ڹٿ��� ���ڿ��� ���� ����ġ���� ����� �� �ְ� ����� �߰��Ǿ��� type
		case "R":
			int w = kb.nextInt();// Ű����� �Է¹ް�
			int h = kb.nextInt();
			Rectangle r = new Rectangle(w,h); //��ü ����
			addShape( r ); // ��ü�� add �ϱ�
			break;
		case "C":
			addShape( new Circle (kb.nextInt())); // �̷������� ���߸� �� ����
			break;
		case "T":
			// �ϴ� ����!
		}
	}

	private void addShape(Shape shape) { //�������� ���ؼ� shapeŸ�� ������ �����������
		shapes[n++] = shape;
	}

	public static void main(String[] args){
// �� ���� �Լ���shapeApplicatron ��ü ������ �ϰ�, ��ü �ȿ� �ִ� process command�� ȣ�����ִ� ���� �Ѵ�
		ShapeApplication app = new ShapeApplication();
		app.processCommand();
		
	}
}
