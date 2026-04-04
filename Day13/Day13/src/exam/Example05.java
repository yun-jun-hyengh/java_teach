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
	 *  - 클래스 업캐스팅 다운캐스팅을 통해 부모 클래스의 타입 하나로 여러 가지 자식 객체들을 
	 *  참조하여 사용함으로써 다형성을 구현할 수 있다. => 어디까지나 다형성을 구현하는데 역할을 하는 것일 뿐임!! 
	 *  
	 *  다형성의 조건
	 *  - 상속 + 메소드 오버라이딩 + 클래스 타입 변환
	 *  
	 *  상속
	 *  부모 <-> 자식 관계가 있어야 시작이 가능함 
	 *  공통된 틀인 부모를 만들고 자식이 그걸 물려받게 해야 한다 
	 *  상속이라는 조건이 없다면 다형성 자체가 성립이 안됨 
	 *  
	 *  메소드 오버라이딩
	 *  같은 이름의 메소드를 자식이 재정의
	 *  부모메소드 => 기본동작
	 *  자식메소드 => 바꾼동작 
	 *  즉) 같은 이름인데 다르게 동작한다 이게 다형성의 핵심이다 
	 *  
	 *  클래스 타입변환
	 *  예시)  Calendar c = new DeskCalendar()
	 *  실제 객체는 DeskCalendar 가 된다 new 연산자로 DeskCalendar 객체를 생성한것임 
	 *  타입은 Calendar가 된다 
	 *  => 여러 자식 객체를 하나의 부모 타입으로 통일해서 쓰려고 
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
