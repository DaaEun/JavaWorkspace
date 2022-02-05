
public class Main9 {
	public static void main(String[] args) {
		
		String me = "YangDaEun";
		char[] chars = new char[me.length()];
		
		for(int i=0; i<chars.length; i++) 
			chars[i] = me.charAt(i);
		
		for(char c : chars)
			System.out.print(c + " ");
		
		
		System.out.println();
		
		//2
		char[] chars2 = me.toCharArray();
		
		for(char c : chars)
			System.out.print(c + " ");
	}
}
