package pcs;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationTest {
	
	static int N, R;
	static int[] inputs, numbers;
	static boolean[] isChecked;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		
		inputs = new int[N];
		numbers = new int[R];
		isChecked = new boolean[N];
		for (int i = 0; i < N; i++) {
			inputs[i] = sc.nextInt();
		}
		permutation(0);
		sc.close();
	}
	
	public static void permutation(int cnt) {
		
		// 기본파트
		if(cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// 유도파트
		for (int i = 0; i < N; i++) {
			if(isChecked[i]) continue;
			
			numbers[cnt] = inputs[i];
			isChecked[i] = true;
			permutation(cnt+1);
			
			isChecked[i] = false;
		}
		
	}
}
