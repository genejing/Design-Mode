package SimpleFactory;

public class MainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		Fruit apple = FruitFactory.getFruit("apple");
//		Fruit banana = FruitFactory.getFruit("banana");
//		apple.get();
//		banana.get();
		Fruit apple = FruitFactory.getFruit("Apple");
		apple.get();
		Fruit banana = FruitFactory.getFruit("Banana");
		banana.get();
	}

}
