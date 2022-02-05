
public class Main4 {
	public static void main(String[] args) {
		
		int N = 6;
		
		int num1 = (int)(Math.random()*N) + 1;
		int num2 = (int)(Math.random()*N) + 1;
		System.out.println(num1);
		System.out.println(num2);
		
		String result = null;
		
		boolean isNum1Even = (num1%2 == 0);
		boolean isNum2Even = (num2%2 == 0);
		
		result = isNum1Even==isNum2Even? "A" : "B";
		System.out.println(result);
		
		result = (num1+num2)%2==0? "A":"B";
		System.out.println(result);
	}
}
