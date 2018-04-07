package SimpleFactory;

public class FruitFactory {
	
//	/**
//	 * ˙获得实例
//	 */
//	public static Fruit getApple() {
//		return new Apple();
//	}
//	
//	public static Fruit getBanane() {
//		return new Banana();
//	}
	
	/*
	 * 第一种改进
	 */
	public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException {
		if (type.equalsIgnoreCase("apple")) {
			return Apple.class.newInstance();
		} else if (type.equalsIgnoreCase("banana")){
			return Banana.class.newInstance();
		} else {
			return null;
		}
	}
	
	/*
	 * 第二种改进
	 */
//	public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		Class fruit = Class.forName(type);
//		return (Fruit) fruit.newInstance();
//	}
	
	
	
	
}
