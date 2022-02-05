
public class Main19 {
	
	public static void main(String[] args) {
		
		int target = 5/2;
		int blank = 0; 
		int no = 1;
		int a = 1;
		
		while(no<=17) {
			for(int i=0; i<blank; i++) {
				System.out.printf("%3s", " ");
			}
			for(int j=0; j<5-2*blank; j++) {
				System.out.printf("%3d", no++);
			}
			for(int i=0; i<blank; i++) {
				System.out.printf("%3s", " ");
			}
			System.out.println();
			
			blank += a;
			
			if(blank == target) {
				a= a==1? -1:1;
			}
		}
	}
}
