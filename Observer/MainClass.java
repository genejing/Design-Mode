package Observer;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		//注册观察者
		person.addObserver(new MyObserver());
		
		person.setName("d");
		
	}
	
}
