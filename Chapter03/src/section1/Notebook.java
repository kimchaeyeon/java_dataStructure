package section1;

public class Notebook extends Computer{ //��ǻ��Ŭ������ ��� �κ��� ��ӹ޴´�, �θ�Ŭ������  �޼ҵ�Ÿ���� private�̸� �ڽ�Ŭ�������� ����� �� ����. �̷� �� ����ϴ� Ÿ���� protected
	
	public double screenSize;
	public double weight;
	
	public Notebook( String man, String proc, int ram, int disk, double speed, double screen, double weight){ //������ Ŭ������ �ɹ��� �Ű������� �޾Ƽ� �ʱ�ȭ�ϱ�
		super( man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}
	public String toString(){ // ��ü�� ������ �ϳ��� ���ڿ��� �������ִ� �Լ� , �޼ҵ� �������̵� �ؼ� notebookŬ���� �뵵�� �°Բ� �����ߴ�.
		String result = super.toString() + //�θ�κ��� �������� �޼ҵ带 ȣ���ϰ�, �޼ҵ带 �������̵��Ѵ�
		                "\nScreen Size: " + screenSize + " inches" +
                        "\nWeight: " + weight + " kg";
		return result;
	}
	public static void main(String [] args){
		Computer test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2); //������,����Ŭ���� Ÿ���� ����(��������)�� ����Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�.
//      test ������ Ÿ���� computer�ε� ������ ������ �����ϰ� �ִ� ��ü�� notebook��ü�̴�.

//      Computer test2 = new Computer("Dell", "i5", 4, 1000, 3.2);

/*		test.manufacturer = "Dell";
		test.processor = "i5";
		test.ramSize = 4;
		test.diskSize =1000;
		test.processorSpeed = 3.2;
		
		test.screenSize = 15.6;
		test.weight = 1.2;
*/
		
//      System.out.println( test.computePower() );
		System.out.println( test.toString() ); // static binding vs dynamic binding(win!!!)
		//������ Ÿ���� �ƴ϶� ���� �����ϰ� �ִ� ��ü�� �޼ҵ带 ȣ���ϰ� �ȴ�.
	}
}