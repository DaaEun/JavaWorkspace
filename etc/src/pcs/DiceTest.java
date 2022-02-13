package pcs;

import java.util.Arrays;
import java.util.Scanner;

public class DiceTest {

	static int N, numbers[], totalCnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();		
		numbers = new int[N];	
		
		int M = sc.nextInt();	
		switch (M) {
		case 1:		// 주사위 던지기1 : 중복순열
			dice1(0);
			break;
		case 2:		// 주사위 던지기2 : 순열
			dice2(0, new boolean[7]);
			break;
		case 3:		// 주사위 던지기3 : 중복조합
			dice3(0, 1);
			break;
		case 4:		// 주사위 던지기4 : 조합
			dice4(0, 1);
			break;
		default:
			break;
		}
		System.out.println("총 경우의 수 : " + totalCnt);
		
		sc.close();
	}

	private static void dice1(int cnt) {
		
		if(cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for (int i = 1; i <= 6; i++) {
			numbers[cnt] = i;
			dice1(cnt+1);
		}
	}
	
	private static void dice2(int cnt, boolean[] isChecked) {
		
		if(cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for (int i = 1; i <= 6; i++) {
			if(isChecked[i]) continue;
			
			numbers[cnt] = i;
			isChecked[i] = true;
			dice2(cnt+1, isChecked);
			isChecked[i] = false;
		}
	}
	
	private static void dice3(int cnt, int start) {
		
		if(cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for (int i = start; i <= 6; i++) {
			numbers[cnt] = i;
			dice3(cnt+1, i);
		}
	}
	
	private static void dice4(int cnt, int start) {
		
		if(cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for (int i = start; i <= 6; i++) {
			numbers[cnt] = i;
			dice4(cnt+1, i+1);
		}
	}
}
