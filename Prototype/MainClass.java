package Prototype;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		
		List<String> list = new ArrayList<>();
		list.add("tom");
		list.add("jim");
		person1.setFriends(list);
		System.out.println(person1.getFriends());
		Person person2 = person1.clone(); //在堆上另外开辟空间，只不过数据和1相同
		System.out.println(person1.getFriends());
		System.out.println(person2.getFriends());
		list.add("cat");

		

		System.out.println(person1.getFriends());
		System.out.println(person2.getFriends());

	}

}
