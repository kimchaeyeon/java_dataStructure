package Section2;
// 1~100000 사이의 소수를 찾아 출력한다.
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
		return true; //이자리까지 왔다는 것에 대해서 트루를 한다.
	}

}
