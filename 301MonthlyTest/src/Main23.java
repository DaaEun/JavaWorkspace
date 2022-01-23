import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main23 {
	
		static int T, N;
		static int Answer;
		static int[][] area;
		static int[] dr = {-1,-1,-1,0,0,1,1,1};
		static int[] dc = {-1,0,1,-1,1,-1,0,1};
		
		public static void main(String[] args) throws Exception{
			
			System.setIn(new FileInputStream("Solution13.txt"));
			Scanner sc = new Scanner(System.in);

			int T = sc.nextInt();
			for(int tc = 1; tc <= T; tc++)
			{
				N = sc.nextInt();
				area=new int[N][N];
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						area[i][j] = (sc.next().charAt(0) == 'B')?1:0; // 빌딩이면 1, 공원이면 0
					}
				}

				Answer=0;
				for(int r=0; r<N; r++) {     //모든 구획을 검색
					for(int c=0; c<N; c++) {
						if(area[r][c]==0)continue;//B구획이 아니면 다음 구획으로	
						
						int bCount=0;
						if(!existsPark(r, c)){
							//인접한 구획에 G가 없을 경우 가로행, 세로열에 있는 B구획을 count
							for(int k=0; k<N; k++){//세로열 B구획 세기
								bCount += (area[k][c]+area[r][k]);
							}
							bCount--;// 자신 중복제거
						}else {
							bCount = 2;
						}
						if(bCount>Answer) Answer=bCount;
					}//end for c
				}//end for r

				System.out.println("#"+tc+" "+Answer);
			}//end testcase
		}
		
		//팔방이 경계내에 있고 G가 있는 지 확인.
		public static boolean existsPark(int r,int c) {

			int nr=0,nc=0;
			final int SIZE = dr.length;
			for(int d=0 ;d<SIZE; ++d) {
				nr = r + dr[d];
				nc = c + dc[d];
				if(nr<0 || nr>=N || nc<0 || nc>=N // 경계를 벗어나거나
						|| area[nr][nc]==1) { // 빌딩이면 다음 구획 검사
					continue;
				}
				// 공원이면 탐색 끝
				return true;
			}
			return false;
		}
	}

