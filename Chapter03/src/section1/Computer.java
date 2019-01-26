package section1;
// 한대의 컴퓨터를 표현하기 위한 클래스
public class Computer {
	protected String manufacturer;
	protected String processor;
	protected int ramSize;
	protected int diskSize;
	protected double processorSpeed;
	
	public Computer(String man, String proc, int ram, int disk, double procSpeed){
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = procSpeed;
	}
	public double computePower(){ //컴퓨터의 계산 능력을 리턴해주는 함수
		return ramSize * processorSpeed;
	}
	public double getRamSize(){   
		return ramSize;
	}
	public double getProcessorSpeed(){
		return processorSpeed;
	}
	public int getDiskSize(){
		return diskSize;
	}
	public String toString(){ // 객체의 값들을 하나의 문자열로 리턴해주는 함수
		String result = "Manufacturer: " + manufacturer +
		                "\nCPU: " + processor +
		                "\nRAM: " + ramSize + " megabytes" +
		                "\nDisk: " + diskSize + " gigabytes" +
                        "\nProcessor Speed: " + processorSpeed + " gigahertz" ;
		return result;
	}
}


