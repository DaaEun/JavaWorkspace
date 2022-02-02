
public class AppropriateParameter {
	
	public void useJump1(Object obj) {
		if(obj instanceof Person) {
			Person casted = (Person) obj;
			casted.jump();
		}
	}
	
	public void useJump2(Person person) {
		person.jump();
	}
	
	public void useJump2(SpiderMan spiderMan) {
		spiderMan.jump();
	}
}

public class polyTest {

	public static void main(String[] args) {
		
		Object obj = new Object();
		Person person = new Person();
		SpiderMan sman = new SpiderMan();
		
		AppropriateParameter ap = new AppropriateParameter();
		
		//호출은 가능하나 실제로 jump할 수 없다. -> 런타임 에러
		ap.useJump1(obj);
		ap.useJump1(person);
		ap.useJump1(sman);
		
//		ap.useJump2(obj);
		ap.useJump2(person);
		ap.useJump2(sman);
		
//		ap.useJump3(obj);
//		ap.useJump3(person);
		ap.useJump3(sman);
		
	}
}
