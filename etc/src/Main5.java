
public class Main5 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<100; i++) {
			sum += (int)(Math.random()*6)+1;
		}
		
		avg = 1.0*sum/100;
		System.out.printf("sum : %d, avg: %.2f", sum, avg);	
		
	}
}
