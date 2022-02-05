import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main20 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input.txt"));
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
	}
}
