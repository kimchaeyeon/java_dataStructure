package Section2;
// 1~100000 ������ �Ҽ��� ã�� ����Ѵ�.
public class Code17 {

	public static void main(String[] args) {
		for(int n=2; n<100000; n++){
			if (isPrime(n)){
				System.out.println(n);
				
			}
		}
	}
	
	static boolean isPrime(int k){
		
		for (int i=2; i*i<=k; i++)
			if (k%i ==0)
				return false;
		return true; //���ڸ����� �Դٴ� �Ϳ� ���ؼ� Ʈ�縦 �Ѵ�.
	}

}
