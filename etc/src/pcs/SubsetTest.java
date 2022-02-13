package pcs;

import java.util.Scanner;

public class SubsetTest {
	
	static int N;
	static int[] inputs;
	static boolean[] isChecked;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		inputs = new int[N];
		isChecked = new boolean[N];
		for (int i = 0; i < N; i++) {
			inputs[i] = sc.nextInt();
		}
		subset(0);
		sc.close();
	}
	
	public static void subset(int cnt) {
		// 기본파트
		if(cnt==N) {
			for (int i = 0; i < N; i++) {
				System.out.print((isChecked[i] ? inputs[i] : "X") + " ");
			}
			System.out.println();
			return;
		}
		
		// 유도파트
		isChecked[cnt] = true;
		subset(cnt+1);
		isChecked[cnt] = false;
		subset(cnt+1);
	}
}
