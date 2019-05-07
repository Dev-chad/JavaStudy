package collection;

public class Apple {
	String company;
	String color;
	int price;
	float width;
	float height;
	
	public static void main(String[] args) {
		Box2<Apple> b = new Box2<Apple>();
		Apple a = new Apple();
		b.t = a;
		
	}
}
