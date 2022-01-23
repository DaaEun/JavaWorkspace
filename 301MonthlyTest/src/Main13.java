import java.util.Arrays;

public class Main13 {
	public static void main(String[] args) {
        
		int[] intArray = {3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3};
		int[] used = new int[10];
		
		for(int num : intArray) {
			used[num]++;
		}
		
		System.out.println(Arrays.toString(used));
		
		for(int i=0; i<used.length; i++) {
			if(used[i] == 0) System.out.println(i + " ");
		}
		
	}
}
