package Singleton;

 //懒汉式

public class Person3 {
	public static Person3 person;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person3() {}
	
	//提供一个全局的静态方法
	public static Person3 getPerson() {
		if (person == null) {
			synchronized (Person3.class) {
				if (person == null) {
					person = new Person3();
				}
			}
		}
		return person;
	}
	
	
	
}
