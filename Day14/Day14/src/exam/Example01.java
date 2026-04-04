package exam;

class Animal {
	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Bird extends Animal {
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 다형성(Polymorphism)
		 * - 객체 지향 프로그래밍의 대표적인 특징 중 하나
		 * - 하나의 타입으로 다양한 객체를 사용할 수 있다.
		 */
		Animal animal1 = new Dog();
		animal1.sound();
		
		Animal animal2 = new Cat();
		animal2.sound();
		
		Animal animal3 = new Bird();
		animal3.sound();
	}
}
