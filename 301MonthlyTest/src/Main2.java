import java.util.Random;

public class Main2 {
	public static void main(String[] args) {
		
		int N =6;
		
		int num = (int)(Math.random()*N) + 1;
		System.out.println(num);
		
		Random rand = new Random();
		num = rand.nextInt(N) + 1;
		System.out.println(num);
	}
}
