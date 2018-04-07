package Singleton;

 //懒汉式

public class Person2 {
	public static Person2 person;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person2() {}
	
	//提供一个全局的静态方法
	public static Person2 getPerson() {
		if (person == null) {
			return new Person2();
		}
		return person;
	}
	
	
	
}
