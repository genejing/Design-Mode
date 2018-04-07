package AbstractFactory;

public class MainClass {

	public static void main(String[] args)  {
		FruitFactory fruitFactory = new NorthFruitFactory();
		Fruit apple = fruitFactory.getApple();
		apple.get();
		
		FruitFactory fruitFactory2 = new SouthFruitFactory();
		Fruit banana = fruitFactory2.getBanana();
		banana.get();
	
	}

}
