
public class Main11 {

	public static void main(String[] args) {
		
		int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
		
		int min = 1000;
		int max = 0;
		for(int num : intArray) {
			max = num>max? num : max;
			min = num<min? num : min;
		}
		
		System.out.println(max);
		System.out.println(min);
	
	}
}
