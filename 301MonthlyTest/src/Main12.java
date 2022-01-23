
public class Main12 {
	public static void main(String[] args) {
		
		int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
		
		// 평균
		int sum = 0;
		for(int num : intArray) {
			sum += num;
		}
		
		double avg = (double) sum / intArray.length;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		for(int i=0; i<intArray.length; i++) {
			max = (intArray[i]-avg)>max ? intArray[i] : max; 
			min = (intArray[i]-avg)<min ? intArray[i] : min; 
		}
		
		System.out.printf("%.2f\n", avg);
		System.out.println((int) max);
		System.out.println((int) min);
	}
}
