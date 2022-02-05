
public class Main14 {

	public static void main(String[] args) {
		
		char[][] grid = {{'C', 'A', 'A'}, 
                {'C', 'C', 'B'}, 
                {'B', 'A', 'B'}, 
                {'C', 'C', 'C'}};
		
		for(char[] g : grid) {
			for(char c : g) {
				System.out.print(c + " ");
			}
			
			System.out.println();
		}

	}

}
