package exam;

class Animal{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class Example05 {
	/*
	 * 다형성(Polymorphism)
	 *  - 객체 지향 프로그래밍의 대표적인 특징 중 하나로, 하나의 타입으로 다양한 
	 *  객체를 사용할 수 있는 것을 의미 
	 *  - 하나의 코드가 여러 자료형으로 구현되어 실행되는 것 
	 */
	
	// Animal animal = new Human()
	// Animal animal = new Tiger()
	// Animal animal = new Eagle()
	public void moveAnimal(Animal animal) {
		animal.move(); // 이 한줄의 코드가 다형성을 나타내고 있는 것 !! 
	}
	
	public static void main(String[] args) {
		Example05 test = new Example05();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	}
}
