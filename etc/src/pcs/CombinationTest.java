package pcs;

import java.util.Arrays;
import java.util.Scanner;

public class CombinationTest {
	
	static int N, R;
	static int[] inputs, numbers;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		
		inputs = new int[N];
		numbers = new int[R];
		for (int i = 0; i < N; i++) {
			inputs[i] = sc.nextInt();
		}
		combination(0, 0);
		sc.close();
	}
	
	public static void combination(int cnt, int start) {
		
		// 기본파트
		if(cnt == R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// 유도파트
		for (int i = start; i < N; i++) {
			numbers[cnt] = inputs[i];
			combination(cnt+1, start+1);
			
		}
		
	}
}
