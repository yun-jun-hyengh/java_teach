package animal;

abstract class Animal{
	abstract void cry();
}

class Pig extends Animal {

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("꿀꿀");
	}
	
}

public class Farm {
	void sound(Animal animal) {
		animal.cry(); // 매개변수 참조 객체의 오버라이딩된 메소드를 호출 !!
	}
	public static void main(String[] args) {
		Farm farm = new Farm();
		farm.sound(new Pig());
	}
}
