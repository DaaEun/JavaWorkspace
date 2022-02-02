
public class objectTest {

	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj2;
		
		System.out.println("obj1 == obj2 : " + (obj1 == obj2));
		System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));
		
		System.out.println("obj2 == obj3 : " + (obj2 == obj3));
		System.out.println("obj2.equals(obj3) : " + obj2.equals(obj3));
		/*
		obj1 == obj2 : false
		obj1.equals(obj2) : false
		
		obj2 == obj3 : true
		obj2.equals(obj3) : true
		 */
	}

}
