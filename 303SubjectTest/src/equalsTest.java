
public class equalsTest {

	public static void main(String[] args) {
		
		String s1 = new String("Studying Java");
		String s2 = new String("Studying Java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "Studying Java";
		String s4 = "Studying Java";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}
}
