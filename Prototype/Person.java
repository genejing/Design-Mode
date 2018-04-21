package Prototype;

import java.util.List;

public class Person implements Cloneable {
	private String name;
	private String sex;
	private int age;
	private List<String> friends;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;

	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person clone(){
		try {
//			Person person = (Person)super.clone();
			
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
