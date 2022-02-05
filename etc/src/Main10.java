
public class Main10 {

	public static void main(String[] args) {
		
		String num = "1234567890";
		char[] ch = num.toCharArray();
		
		int sum = 0;
		
		for(int i=0; i<ch.length; i++) {
			sum += ch[i]-'0';
 		}
		
		System.out.println(sum);
	}
	
}
