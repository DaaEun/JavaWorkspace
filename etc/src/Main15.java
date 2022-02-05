
public class Main15 {

	public static void main(String[] args) {
		
		int[][] grid = {
                {2, 3, 1, 4, 7},
                {8, 13, 3, 33, 1},
                {7, 4, 5, 80, 12},
                {17, 9, 11, 5, 4},
                {4, 5, 91, 27, 7}
        };
		
		int cnt = 0;
		int sum = 0;
		
		for(int[] g : grid) {
			for(int i : g) {
				if(i%3==0) {
					cnt++;
					sum += i;
				}
			}
		}
		
		System.out.println(cnt);
		System.out.println(sum);
	}
}
