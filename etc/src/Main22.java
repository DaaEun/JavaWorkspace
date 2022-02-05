import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main22 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.setIn(new FileInputStream("input.txt"));
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(in.readLine());
		
		for(int tc=1; tc <= TC; tc++) {
			
			int n = Integer.parseInt(in.readLine());
			int[][] map = new int[n][n];
			
			StringTokenizer st = null;
			
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				for(int j=0; j<n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			st = new StringTokenizer(in.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int nr, nc;
			int[] dr = {-1, 1, 0, 0};
			int[] dc = {0, 0, -1, 1};

			for(int d=0; d<dc.length; d++) {
				nr = r+dr[d];
				nc = c+dc[d];
				
				if(nr>=0 && nr<n && nc>=0 && nc<n) map[nr][nc] = 0;
			}
			System.out.println("#" + tc);
			print(map);	
		}
	}

	private static void print(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) continue;
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
