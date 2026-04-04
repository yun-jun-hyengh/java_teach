package pet;

abstract public class Pet {
	abstract public void walk(); // 추상메소드
	abstract public void eat();
	
	public int health; // 필드
	
	public void run() {
		System.out.println("run");
	}
}
