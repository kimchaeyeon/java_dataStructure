
public class Code7 {

	public static void main(String[] args) {
		
		int grades[];
		int i=0;
		grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		while(i < grades.length){
			System.out.println("Grade" + (i+1) +": " + grades[i]);
			i++;
		}
		
	}

}
